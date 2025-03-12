package com.solucioneskabec.write.writeoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author JARS
 */
public class WriteFileOutputStream {

	public static void main(String[] args) throws IOException {

		String directoryName = "resources/data_files/sample/";
		String fileName = directoryName + "sample_1.txt";
		
		// we need to transfer this string to files
        String st = "Arturo";
        writeOutputStream(st, fileName);
 
		System.out.println("file");
		
		fileName = directoryName + "sample_2.txt";
		
		st = "Welcome to GfG";
        writeOutputStream(st, fileName);

		
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
		
	}
}
