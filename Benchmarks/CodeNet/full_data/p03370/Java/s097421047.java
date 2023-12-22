import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt();//,c=sc.nextInt(),k=sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		int[] array=new int[n];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			sum+=array[i];
			count++;
		}
		Arrays.sort(array);
		while(x-sum>0) {
			sum+=array[0];
			if(x-sum<0)break;
			count++;
		}

		System.out.println(count);
	}
	public static int sample(int n) {
		return n;
	}

}
