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
		    while(T-->0){
		    int N=newScanner.nextInt();
		    String S=newScanner.next();
		    boolean  flag=true;
		    int [] count = new int[26];
		    for(int i=0;i<N;i++){
		        
		        count[S.charAt(i)-97]++;	        
	}
	for(int i=0;i<26;i++){
	    if(count[i]%2!=0)
	        flag=false;
	    
	    
	    
	}
	if(flag){
	    System.out.println("YES");
	}
	else
	System.out.println("NO");
	
	
	
}}}
