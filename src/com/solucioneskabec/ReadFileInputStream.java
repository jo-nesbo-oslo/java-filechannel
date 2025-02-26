package com.solucioneskabec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileInputStream {

	public static void main(String[] args) {

		String fileName = "sample_2.txt";

		// Use try-with-resources to handle resource
		// management
		try (FileInputStream fi = new FileInputStream(fileName)) {

			// Illustrating getChannel() method
			System.out.println("Channel: " + fi.getChannel());

			// Illustrating getFD() method
			System.out.println("File Descriptor: " + fi.getFD());

			// Illustrating available method
			System.out.println("Number of remaining bytes: " + fi.available());

			// Illustrating skip() method
			fi.skip(0);

			System.out.println("File Contents:");

			// Reading characters from FileInputStream
			int ch;
			while ((ch = fi.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: Ensure " + 
								fileName + " exists in the working directory.");
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + 
								e.getMessage());
		}

	}
}
