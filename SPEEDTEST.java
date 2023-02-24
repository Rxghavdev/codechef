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
		  
		    float A=newScanner.nextFloat(); 
		    float X=newScanner.nextFloat(); 
		    float B=newScanner.nextFloat(); 
		    float Y=newScanner.nextFloat(); 
	        float D1=A/X;
	        float D2=B/Y;
	        if(D1<D2){
	            System.out.println("bob");
	        }
	        else if(D2<D1){
	            System.out.println("alice");
	        }
	        else if(D1==D2){
	            System.out.println("equal");
	            
	        }
		    
		}
	
	    
	}}

