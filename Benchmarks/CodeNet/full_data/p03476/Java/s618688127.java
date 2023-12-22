import java.util.*;
public class Main {
	public static void main(String args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			int sum=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int i=a;i<=b;i+=2){
				boolean t=false;
				for(int j=2;j<i;j++){
					if(i%j==0)
						break;
					if(j==i-1)
						t=true;
				}
				boolean r=false;
				i=i+1/2;
				for(int j=2;j<i;j++){
					if(i%j==0)
						break;
					if(j==i-1)
						r=true;
				}
				if(t&&r)
					sum++;
			}
			System.out.println(sum);
		}
	}
}