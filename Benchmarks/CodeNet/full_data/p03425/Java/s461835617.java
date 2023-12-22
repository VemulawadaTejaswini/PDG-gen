import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		long n1=0,n2=0,n3=0,n4=0,n5=0;
		String m[]=new String[n];
		String a[]=new String[n];
		String r[]=new String[n];
		String c[]=new String[n];
		String h[]=new String[n];
		for(int i=0;i<n;i++){
			String s=sc.next();
			if(s.charAt(0)=='M'){
				n1++;
			}
			if(s.charAt(0)=='A'){
				n2++;	
			}
			if(s.charAt(0)=='R'){
				n3++;
			}
			if(s.charAt(0)=='C'){
				n4++;
			}
			if(s.charAt(0)=='H'){
				n5++;
			}
		}
		long sum=0;
		sum+=n1*n2*n3;
		sum+=n1*n2*n4;
		sum+=n1*n2*n5;
		sum+=n1*n3*n4;
		sum+=n1*n3*n5;
		sum+=n1*n4*n5;
		sum+=n2*n3*n4;
		sum+=n2*n3*n5;
		sum+=n2*n4*n5;
		sum+=n3*n4*n5;
		System.out.println(sum);
	}

}
