package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingAndWriting {

	public static void main(String[] args) throws Exception {
		File file = new File("G:\\All_Softwares\\Test.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter("G:\\All_Softwares\\Test.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);
		
		filewriter.write("Please write inside this file");
		filewriter.newLine();
		filewriter.write("This is my second line");
		filewriter.flush();
		
		
		FileReader fr = new FileReader("G:\\All_Softwares\\Test.txt");
		BufferedReader filereader = new BufferedReader(fr);
		String i = " ";
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		
		while((i=filereader.readLine())!= null)
		{
			System.out.println(i);
		}

	}

}
