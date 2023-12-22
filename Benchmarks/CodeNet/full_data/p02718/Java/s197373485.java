import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int sam =0;
		int[] ar =new int[1004];
		for(int i=0;i<a;i++) {
			ar[i]=scanner.nextInt();
			sam+=ar[i];
		}
		int k=0;
		if(sam%(4*b)!=0)k++;
		k+=sam/(4*b);
		int t=0;
		for(int i=0;i<a;i++) {
			if(ar[i]>=k)t++;
		}
		if(t>=b)System.out.println("Yes");
		else System.out.println("No");
	}

}