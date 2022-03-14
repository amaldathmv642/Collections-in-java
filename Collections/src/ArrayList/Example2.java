package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>();
list.add("mango");
list.add("banana");
list.add("pine apple");
Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
