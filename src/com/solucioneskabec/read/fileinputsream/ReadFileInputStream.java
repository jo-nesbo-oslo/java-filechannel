package com.solucioneskabec.read.fileinputsream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ReadFileInputStream git sample demo 
 */
public class ReadFileInputStream {

	/** 
	* @author: Arturo
	*/
	public static void main(String[] args) {

		String directoryName = "./resources/data_files/";
		String fileName = directoryName + "sample_3.txt";

		// Use try-with-resources to handle resource
		// management
		try (FileInputStream fi = new FileInputStream(fileName)) {

			// Illustrating getChannel() method
			// TODO: Cambiar por logger
			System.out.println("Channel: " + fi.getChannel());

			// Illustrating getFD() method
			// TODO: Cambiar por logger
			System.out.println("File Descriptor: " + fi.getFD());

			// Illustrating available method
			// TODO: Cambiar por logger Slf4j
			System.out.println("Number of remaining bytes: " + fi.available());

			// Illustrating skip() method
			fi.skip(0);

			// TODO: Cambiar por logger Slf4j
			System.out.println("File Contents:");

			// Reading characters from FileInputStream
			int ch;
			while ((ch = fi.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			// TODO: Cambiar por logger Slf4j
			System.out.println("File not found: Ensure " + fileName + " exists in the working directory.");
		} catch (IOException e) {
			// TODO: Cambiar por logger Slf4j
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}

	}
}
