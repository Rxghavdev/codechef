//* package codechef; // don't place package name! */

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
		    int PA=newScanner.nextInt();
		    int PB=newScanner.nextInt();
		    int QA=newScanner.nextInt();
		    int QB=newScanner.nextInt();
		    
		    //int P=PA+PB;
		    //int Q=QA+QB;
		   int x = Math.max(PA,PB);
		    int y = Math.max(QA,QB);
		    if(x>y){
		        System.out.println("q");
		    }
		    else if (x==y){
		        System.out.println("tie");
		    }
		    else {
		        System.out.println("p");
		    }
		}
	    
	}
    
}

