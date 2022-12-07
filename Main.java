package lab4;

import java.io.IOException;
public class Main {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String nameFile = "C:\\foreign_names.csv";
		CsvToList.readFile(nameFile);
	}
}
