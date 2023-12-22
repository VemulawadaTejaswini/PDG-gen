
import java.io.*;
import java.util.*;


	public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int number=x;
		if(x==2)
			System.out.print("2");
		if(x==1)
			System.out.print("1");
		for(int i= 0; i<x; i++)
		{
			if((number-i)<i) {
				//don't do anything
			}else {
				number=number-i;
			}
			if((number-i)==0)
			{
				number= number-i;
				System.out.print(i);
				break;
			}

			

		}
	}
}
	
