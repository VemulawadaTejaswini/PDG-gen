/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    long start = System.currentTimeMillis();
	    Scanner sn = new Scanner(System.in);
	    String[] s = sn.nextLine().split(" ");
	    int[] cookies = new int[3];
	    for(int i = 0;i<s.length;i++){
	        cookies[i] = Integer.parseInt(s[i]);
	    }
	    
	    long current = System.currentTimeMillis();
	    int[] temp = new int[cookies.length];
	    int count = 0;
	    boolean flag = true;
	    
	    while(flag){
	        current = System.currentTimeMillis();
	        if(current - start > 1950){
	            System.out.println("-1  " + count);
	            break;
	        }
	        for(int i = 0;i<cookies.length;i++){
	            if(cookies[i] % 2 == 1){
	                System.out.println(count);
	                flag = false;
	                break;
	            }
	            temp[i] = cookies[i];
	        }
	        
	        cookies[0] = (temp[1] / 2) + (temp[2] / 2);
	        cookies[1] = (temp[0] / 2) + (temp[2] / 2);
	        cookies[2] = (temp[0] / 2) + (temp[1] / 2);
	        count++;
	    }
	    
	}
}