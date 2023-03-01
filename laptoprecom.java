import java.util.*;
import java.lang.*;
import java.io.*;

public class laptoprecom{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner newScanner =new Scanner(System.in);
		int T=newScanner.nextInt();
		int[] arr=new int[10];
		for(int i=0;i<T;i++){
		    int N=newScanner.nextInt();
		    for(int j=0;j<N;i++){
		        arr[j]=newScanner.nextInt();
		        for(int k=0;k<N;i++){
		            for(int z=k+1;z<10;z++){
		                if(arr[j]==arr[z]){
		                    System.out.println(arr[j]);
		                }
		                
		            }
		        }
		        
		        
		    }
		    
		    
	}
}}
