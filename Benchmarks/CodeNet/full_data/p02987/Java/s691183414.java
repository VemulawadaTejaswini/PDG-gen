import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		//String t= sc.next();
		String[] buff= {"","","",""};
		//int n = sc.nextInt();
		//int m = sc.nextInt();
		//int k = sc.nextInt();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		int[] array = new int[3];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		Arrays.sort(array);

		for(int i=0;i<4;i++) {
			buff[i]=s.substring(i,i+1);
		}

		if(buff[0].equals(buff[1])&&!buff[1].equals(buff[2])&&buff[2].equals(buff[3])) {
			System.out.println("Yes");
		}else if(buff[0].equals(buff[3])&&buff[1].equals(buff[2])&&!buff[0].equals(buff[1])){
			System.out.println("Yes");
		}else if(!buff[0].equals(buff[1])&&!buff[2].equals(buff[3])&&buff[0].equals(buff[2])&&buff[1].equals(buff[3])){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		//System.out.println(n*n);
	}
}


