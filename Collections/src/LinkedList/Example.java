package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
LinkedList<String>al=new LinkedList<String>();
al.add("amal");
al.add("amar");
al.add("alan");
al.add("amarish");
al.add("arjun");
Iterator<String>itrr=al.iterator();

while(itrr.hasNext())
{
	System.out.println(itrr.next());
}
	}

}
