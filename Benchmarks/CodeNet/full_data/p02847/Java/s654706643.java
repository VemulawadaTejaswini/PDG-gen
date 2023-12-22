import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		//String t= sc.next();
		//int n = sc.nextInt();
		//int m = sc.nextInt();
		//int k = sc.nextInt();
		long count=0;
		long count1=0;
		int[] array = new int[3];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		Arrays.sort(array);

		/*for(int i=0;i<3;i++) {
			if(s.substring(i,i+1).equals(t.substring(i,i+1))) {
				count++;
			}
		}*/

		if(s.equals("SUN")) {//SUN,MON,TUE,WED,THU,FRI,SAT
			System.out.println(7);
		}else if(s.equals("MON")){
			System.out.println(6);
		}else if(s.equals("TUE")){
			System.out.println(5);
		}else if(s.equals("WED")){
			System.out.println(4);
		}else if(s.equals("THU")){
			System.out.println(3);
		}else if(s.equals("FRI")){
			System.out.println(2);
		}else if(s.equals("SAT")){
			System.out.println(1);
		}

		//System.out.println(n*n);
	}
}


