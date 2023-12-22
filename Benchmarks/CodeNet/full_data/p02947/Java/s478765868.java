import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] buff=new String[n];
		long count=0,sum=0;

		for(int i=0;i<n;i++) {
			buff[i]=sc.next();
			buff[i]=sortS(buff[i]);
		}
		Arrays.sort(buff);
		for(int i=0;i<n-1;i++) {
			if(buff[i].equals(buff[i+1]))count++;
			else {
				if(count>=1) {
					sum+=(long)(0.5*count*(count+1));
				}
				count=0;
			}
			//System.out.println("count:"+count+" sum:"+sum);
		}
		if(count!=0)sum+=(long)(0.5*count*(count+1));
		System.out.println(sum);
	}
	public static String sortS(String s) {
		char[] sort = new char[s.length()];
		String res="";
		for(int i=0;i<sort.length;i++) {
			sort[i]=s.charAt(i);
		}
		Arrays.sort(sort);
		for(int i=0;i<sort.length;i++) {
			res+=String.valueOf(sort[i]);
		}
		return res;
	}
}

