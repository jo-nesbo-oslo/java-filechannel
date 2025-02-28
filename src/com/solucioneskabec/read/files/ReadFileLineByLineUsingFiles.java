package com.solucioneskabec.read.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileLineByLineUsingFiles {
	public static void main(String[] args) {
		String directoryName = "./resources/data_files/";
		String fileName = directoryName + "test.txt";
		try {
			List<String> allLines = Files.readAllLines(Paths.get(fileName));

			for (String line : allLines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
