import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//, a = sc.nextInt(),b=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[n];
		//String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();
		}
		for(int j=0;j<30;j++) {
			for(int i=0;i<n;i++) {
				if(array[i]%2==0) {
					array[i]=array[i]/2;
				}else {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
		//System.out.println(max);



	}
	public static int sample(int n) {
		return n;
	}

}
