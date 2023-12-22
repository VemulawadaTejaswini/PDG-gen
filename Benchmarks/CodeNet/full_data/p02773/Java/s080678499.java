/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap; // import the HashMap class
import java.util.ArrayList;
import java.util.Collections;   


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in); 
		
		String strN = sc.nextLine();
		int max = 0;
		int n = Integer.parseInt(strN);
		HashMap<String, Integer> stringMap = new HashMap<String, Integer>();
		ArrayList<String> maxVotes = new ArrayList<String>();
		while(n>0){
			String vote = sc.nextLine();
			
			int num = 1;
			if(!stringMap.containsKey(vote)){
				stringMap.put(vote,num);
				
			}
			else{
				num = stringMap.get(vote)+1;
				stringMap.replace(vote,num);
			}
			if(max<num)
				max = num;
			n = n - 1;
		}		
		
		
		for (String S : stringMap.keySet()) {
			if(stringMap.get(S) == max)
				maxVotes.add(S);
		}
		Collections.sort(maxVotes);
		
		for(String s:maxVotes)
			System.out.println(s);
    
	}
}