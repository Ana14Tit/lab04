package lab4;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CsvToListTest {

	@Test
	public void testReadFile() throws IOException {
	
		assertFalse(CsvToList.readFile("C:\\foreign_names.csv").isEmpty());
		
	}
}
