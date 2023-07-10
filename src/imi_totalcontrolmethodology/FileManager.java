package imi_totalcontrolmethodology;

import java.io.*;

public class FileManager {

	public void createEmployeeLogFile(){
		File f = new File("..\\EmployeeNumberLog.txt");
		File dir = new File("D:\\logging");
		System.out.println(!dir.mkdir() ? "File Directory Exist": "Successfully Created File Dir");
		System.out.println(f.exists() ? "Already Exist": "Successfully Created Log");
	}
	
	
	
}
