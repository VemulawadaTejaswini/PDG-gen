import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int n=scanner.nextInt();


		Integer[] data=new Integer[n];

		for(int i=0;i<n;i++) {
			data[i]=scanner.nextInt();
		}

		Arrays.sort(data,Comparator.reverseOrder());

		int result=data[0]-data[n-1];

		System.out.println(result);



		scanner.close();

	}

	public static int getsumofkakuketa(int n) {

		int result=0;

		while(true) {

			result+=n%10;

			if(n/10!=0) {
				n/=10;
			}else {
				return result;
			}
		}



	}

	public static boolean isMacthed(int a,int b,int sum) {

		if(sum>=a && sum<=b) {
			return true;
		}else {
			return false;
		}

	}



}





