/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='b'))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
