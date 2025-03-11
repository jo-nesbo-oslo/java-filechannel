package com.solucioneskabec.read.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author JARS
 */
public class ReadFileLineByLineUsingFiles {

	/**
	 * @param args to receive array
	 * 
	 */
	public static void main(String[] args) {
		String directoryName = "./resources/data_files/sample/";
		String fileName = directoryName + "sample_5.txt";
		try {
			List<String> allLines = Files.readAllLines(Paths.get(fileName));

			for (String line : allLines) {
				System.out.println(line);
			}
			System.out.println(printResult(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param fileName the fileName
	 * @return message the message
	 */
	public static String printResult(String fileName) {
		String message ="Archivo " + fileName + " leído exitosamente";
		return message;
	}
}
