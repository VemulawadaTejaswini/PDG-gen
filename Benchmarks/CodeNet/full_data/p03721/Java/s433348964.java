import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main{
	public static void main(String [] args)throws IOException{
    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextInt())
		return;
		int n = sc.nextInt();

		if(n>0&&n<=100000){
			if(!sc.hasNextInt())
			return;
		int k = sc.nextInt();
		int sumel = 0;
		int flag = 0;
		int ans = 0;
		int a  = 0;
		int b  = 0;
		for(int i = 0; i < n;i++){
			if(!sc.hasNextInt())
			return;
			a = sc.nextInt();
			if(!sc.hasNextInt())
			return;
			b = sc.nextInt();
			sumel+=b;
			if(sumel>=k&&flag==0)
			{
				ans = a;
				flag = 1;
			}
		}
		System.out.println(ans);
}
}
}
