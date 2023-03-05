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
		    int X=newScanner.nextInt();
		    int Y=newScanner.nextInt();
            //x is following
            //y is follower
            int Z= Y*10;
            if(Z<=X)
            {
                System.out.println("yes");
            }
            else if{
            System.out.println("no");
            }
            else{
                System.out.println(null);
            }                
		}
	}
}
