import java.util.*;
import java.io.*;
public class Main.java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count =0;
			int place = i;
			int sum = 0;
			int one = 1;
			while(count <n)
			{
				sum+=one*arr[place];
				one*=-1;
				place=(place+1)%n;
				count++;
			}
			System.out.print(sum+" ");
		}
	}

}
