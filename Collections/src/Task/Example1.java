package Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	int a=0 ;int i=0;
	String b=null;
	ArrayList<String>list=new ArrayList<String>();
	do
	{
	
	System.out.println("1.Display Installed Applications");
	System.out.println("2.Install an Application");
	System.out.println("3.Uninstall an Application");
	System.out.println("4.Update");
	System.out.println("5.Quit");
	
	a=s.nextInt();
	
	
	
	 if(a==1)
	 {  
		 if(list.isEmpty())
		 {
		 System.out.println("there is no application");	

	     }
		
		 else
		 {
			 
	     Iterator itr=list.iterator();
		 while(itr.hasNext())	
		 {
	 	 System.out.println(itr.next());
	 }}
	 }
	 
	
	 
	 else if(a==2)
	 {   
		System.out.println("enter app name");
		b=s.next();
		list.add(b);
		System.out.println("app succesfully installed");
		
		
	 }
	 else if(a==3)
	 {  
		 Iterator itr2=list.iterator();
		
	     for( i=0;itr2.hasNext();i++)
		 {
	    	 System.out.println(i+" "+itr2.next());
		 } 
		 System.out.println("enter index");
		 int c=s.nextInt();
		 list.remove(c);
		 
			 
		 System.out.println("app succesfully uninstalled");
	 }
	 
	
	 else if(a==4)
	{
		 Iterator itr1=list.iterator();
		
		for( i=0;itr1.hasNext();i++)
		{
			
			
			 
			  
		 System.out.println(i+" "+itr1.next());
		 
		 
			
		} 
		 System.out.println("enter the application to update");
		 String d=s.next();
		 System.out.println("enter index to update");
		 int p=s.nextInt();
		 list.set(p, d);
			while(itr1.hasNext())
			{
			  
		 System.out.println(itr1.next());
		 
		 }
			
		}
	 else
	 
		return;
	
	 }
	while(a!=0);
	{
		
	}
}}