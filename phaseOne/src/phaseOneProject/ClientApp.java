package phaseOneProject;

import java.util.Scanner;

public class ClientApp 
{
   public static void main(String[] args) 
	{
	   Scanner obj=new Scanner(System.in);
	   int ch;
	   do
	   {
		lockedMe.displayMenu();
		System.out.println("Enter your choice");
		ch=Integer.parseInt(obj.nextLine());
		switch(ch)
		{
		case 1:lockedMe.getAllFiles();
		break;
		case 2:lockedMe.createFiles();
		break;
		case 3:lockedMe.deleteFiles();
		break;
		case 4:lockedMe.searchFile();
		break;
		case 5:System.exit(0);
		break;
		default: System.out.println("Invalid Option");
		break;	
		}
	   }
	   while(ch>0);
		obj.next();
		obj.close();	
	}
}
