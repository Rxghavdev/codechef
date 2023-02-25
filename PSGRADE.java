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
		  
		    float Am=newScanner.nextFloat(); 
		    float Bm=newScanner.nextFloat(); 
		    float Cm=newScanner.nextFloat(); 
		    float Tm=newScanner.nextFloat();
		    float A=newScanner.nextFloat(); 
		    float B=newScanner.nextFloat(); 
		    float C=newScanner.nextFloat();
		    
		    float Z= A+B+C;
		    if(Am<=A && Bm<=B && Cm<=C && Tm<=Z){
		        System.out.println("yes");
		    }
		        else{
		            System.out.println("NO");
		        }
		    
		  //  else{
		  //      System.out.print("NO");
		    
		    
	}
}}
