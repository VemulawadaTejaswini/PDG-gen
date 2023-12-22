import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), b = sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
		int sum=0,count=1,flag=0,max=-999999,min=99999;
		int[] array=new int[10000];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		array[0]=n;
		array[1]=b;
		array[2]=c;
		Arrays.sort(array);
		array[9999]=(int) (Math.pow(2, k)*array[9999]);
		for(int i=9999;i>=0;i--) {
			sum+=array[i];
		}
		System.out.println(sum);
	}
	public static int sample(int n) {
		return n;
	}

}
