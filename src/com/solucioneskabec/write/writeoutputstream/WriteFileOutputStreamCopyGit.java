package com.solucioneskabec.write.writeoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author JARS
 * @param String args
 */
public class WriteFileOutputStreamCopyGit {

	public static void main(String[] args) throws IOException {

		String directoryName = "resources/data_files/sample/";
		String fileName = directoryName + "sample_1.txt";
		
		// we need to transfer this string to files
        String st = "Arturo Acevedo";
        writeOutputStream(st, fileName);

		
		fileName = directoryName + "sample_2.txt";
		
		// Agregar Logger
		System.out.println("file " + directoryName);

		st = "Welcome to GFG";
        writeOutputStream(st, fileName);

		System.out.println("file processed" + directoryName);
		
		
	}
	
	/**
	 * @author: JARS
	 * @param stringData the stringData
	 * @param fileSample the fileSample
	 */
	public static void writeOutputStream(String stringData, 
			String fileSample) throws IOException {
		try(FileOutputStream fileOutputStream = new FileOutputStream(fileSample, true)) {
			char[] ch = stringData.toCharArray();
			int stringLength = stringData.length();
			for (int i = 0; i < stringLength; i++) {

				/* we will write the string by writing each
				character one by one to file*/

				fileOutputStream.write(ch[i]);
			}
			
			fileOutputStream.flush();
		}
		fileOutputStream.flush();
		fileOutputStream.close(); //TODO: resisar si esta línea procede porque está antecedida 
		// por try with resources
		
	}
}
