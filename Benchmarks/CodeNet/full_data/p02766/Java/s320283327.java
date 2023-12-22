import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.*;

public class Main {
		public static void main(String[] args) throws Exception{
			Scanner sc=new Scanner(System.in);
			PrintWriter pw= new PrintWriter(System.out);
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=0;
			int temp=1;
			while(n>=Math.pow(k, temp)) {
				temp++;
			}
			pw.println(temp);
			sc.close();
			pw.close();
			
		}
	
	
}
