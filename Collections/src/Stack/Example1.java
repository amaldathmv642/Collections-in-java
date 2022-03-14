package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Stack<String>sc=new Stack<String>();
		sc.add("akhila");
		sc.add("anagha");
		sc.add("anjana");
		sc.add("anushka");
		sc.add("amaya");
		sc.pop();
		Iterator<String>it=sc.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
