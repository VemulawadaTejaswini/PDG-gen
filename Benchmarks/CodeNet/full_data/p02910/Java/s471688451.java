import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		//int m = sc.nextInt();
		//int k = sc.nextInt();
		//String s=sc.next();
		long count=0,flag=0;
		long count1=0,count2=0;
		int count3=0;
		//int[] array = new int[m];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		//Arrays.sort(array);

		for(int i=0;i<s.length();i++) {
			if((i+1)%2==0) {
				if((char)s.charAt(i)=='R') {
					System.out.println("No");//R, U, D のいずれか。偶数文字目がすべて L, U, D の
					System.exit(0);
				}
			}else {
				if((char)s.charAt(i)=='L') {
					System.out.println("No");//R, U, D のいずれか。偶数文字目がすべて L, U, D の
					System.exit(0);
				}
			}
		}
		/*for(int i=0;i<m;i++) {
			if(array[i]>=k) {
				count++;
			}
		}*/

		/*if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}*/

		System.out.println("Yes");
	}
}


