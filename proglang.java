/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner newScanner =new Scanner(System.in);
		int T=newScanner.nextInt();
		for(int i=0;i<T;i++){
		    int a=newScanner.nextInt();
		    int b=newScanner.nextInt();
		    int a1=newScanner.nextInt();
		    int b1=newScanner.nextInt();
		    int a2=newScanner.nextInt();
		    int b2=newScanner.nextInt();
		    
		    if((a==a1 || a==b1) && (b==a1 || b==b1)){
		        System.out.println(1);
		    }
		    else if((a==a2 || a==b2) && (b==a2 || b==b2)){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(0);
		    }
		    
		    
		    
	}
}}

