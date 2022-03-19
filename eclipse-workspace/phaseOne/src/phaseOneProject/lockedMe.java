package phaseOneProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class lockedMe
{
static final String projectFilesPath="C:\\Users\\SAURABH\\eclipse-workspace\\MY FILES";

		public static void displayMenu()
		{
			System.out.println("**********************************************");
			System.out.println("WELCOME TO LockedMe.com SECURE APPLICATION");
			System.out.println("Devloped by : Saurabh B. Mokal.");
			System.out.println("**********************************************");
			System.out.println("\t1. Display all files.");
			System.out.println("\t2. Add a new files.");
			System.out.println("\t3. Delete a file.");
			System.out.println("\t4. Search file.");
			System.out.println("\t5. Exit");
			System.out.println("**********************************************");
		
		}
		
		public static void getAllFiles()
		{
			File folder= new File(projectFilesPath);
			File[] listofFiles=folder.listFiles();
			if(listofFiles.length>0)
			{
				System.out.println("Files list is below \n");
			for (var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
			else
			{
				System.out.println("The folder is empty.");
			}
		}
		public static void createFiles()
		{
			try
			{
			Scanner obj=new Scanner(System.in);
			String fileName;
			System.out.println("Enter file name");
			fileName=obj.nextLine();
			int linesCount;
			System.out.println("Enter how many lines in the file");
			linesCount=Integer.parseInt(obj.nextLine());
			FileWriter fw=new FileWriter(projectFilesPath+"\\"+fileName);
			for(int i=1;i<=linesCount;i++);
			{
				System.out.println("Enter file line");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Created Successfully.");
			fw.close();
			}
			catch(Exception Ex)
			{
			}
			}
		public static void deleteFiles()
		{
			try
			{
			Scanner obj=new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name which you want to delete\n");
			fileName=obj.nextLine();
			File f= new File(projectFilesPath+"\\"+fileName);
			if (f.exists())
			{
				f.delete();
				System.out.println("File deleted Successfully.");
			}
			else
			{
				System.out.println("File does not exist");
			}
		}
		catch (Exception Ex)
		{
			System.out.println("Unable to delete your selected file.");
		}
		}

		public static void searchFile()
		{
			try
			{
		Scanner obj= new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name to be searched");
		fileName=obj.nextLine();
		ArrayList<String> allFilesNames=new ArrayList<String>();
		File folder=new File(projectFilesPath);
		File[] listOfFiles= folder.listFiles();
		if(listOfFiles.length>0)
		{
			for(var l:listOfFiles)
			{
				allFilesNames.add(l.getName());
			}
			}
		File f=new File(projectFilesPath+"\\"+fileName);
		if(allFilesNames.contains(fileName))
		{
			System.out.println("File is available");
		}
		else
		{
			System.out.println("File is not available");	
		}
		}
			catch(Exception Ex)
			{
				System.out.println("Invalid file.");
			}
			
			}


		private static boolean checkFileExists(String fileName) {
		
			return false;
		}
		
}
		
		
	

 
