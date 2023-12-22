import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		boolean flag=true;
		
		int num=sc.nextInt();
		int t[]=new int[100000];
		int x[]=new int[100000];
		int y[]=new int[100000];
		
		for(int i=0;i<num;i++) {
			t[i]=sc.nextInt();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		int count=0;
		int timesum=0;
		for(int i=0;i<num;i++) {
			if(i==0) {
				count=x[i]+y[i];
				timesum=t[0];
			}else {
			    count+=Math.abs(x[i]-x[i+1])+Math.abs(y[i]-y[i-1]);
			    timesum=t[i];
			}
			
			if(count>timesum) {
				flag=false;
				break;
			}else if(i==num-1&&count<timesum) {
				if((timesum-count)%2!=0) {
					flag=true;
				}else {
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}