package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CsvToList {
	public static List<Person> readFile(String fileName) throws IOException {
		List<Person> result = new ArrayList<Person>(25899);
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\foreign_names.csv")));
		 try {
		        String line = br.readLine();
		        if (line==null) throw new IllegalArgumentException("File is empty");
		        if (!line.equals("id;name;gender;BirtDate;Division;Salary"))
		            throw new IllegalArgumentException("File has wrong columns: "+line);
		        while ((line = br.readLine()) != null) {
		        	int i=0;
		            String[] items = line.split(";");
		            try {
		                if (items.length>6) throw new ArrayIndexOutOfBoundsException(); 
		                Person person = new Person();
		                
		                person.setId(Integer.parseInt (items[0]));
		                
		                person.setName(items[1]); 
		                
		                person.setGender(items[2]);
		                
		                person.setBirthdate(items[3]);
		                
		                Devision d=new Devision();
		                
		                d.setName_d(items[4]);
		                
		                d.setId_d(i);
		                
		                person.setDevision(d);
		                
		                person.setSalary(Integer.parseInt (items[5]));
		                
		                result.add(person);
		                i++;
		                System.out.println("Invalid line: "+ line);
		            } catch (ArrayIndexOutOfBoundsException|NumberFormatException|NullPointerException e) {
		                
		            }
		        }
		        return result;
		  } finally {
		        br.close();}
		 
	}
}
