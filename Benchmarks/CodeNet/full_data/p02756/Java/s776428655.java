import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(scan.next());
		int n = scan.nextInt();
		boolean reverse = false;

		for(int i = 0; i < n; i++){

			if(scan.nextInt() == 1)reverse = !reverse; 

			else if(reverse){
				if(scan.nextInt() == 1)sb.append(scan.next());
				else sb.insert(0, scan.next());
			}
			
			else{
				if(scan.nextInt() == 2)sb.append(scan.next());
				else sb.insert(0, scan.next());
			}

		}

		System.out.println(reverse?sb.reverse().toString():sb.toString());

	}
}