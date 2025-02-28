package com.solucioneskabec.read.randomaccessfile;


import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFileLineByLineUsingRandomAccessFile {

	public static void main(String[] args) {
		try {
			String directoryName = "resources/data_files";
			String fileName = directoryName + "/" + "sample.txt";
			RandomAccessFile file = new RandomAccessFile(fileName, "r");
			String str;

			while ((str = file.readLine()) != null) {
				System.out.println(str);
			}

			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
