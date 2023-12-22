
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int []arr=new int[5];
		int sum=0;
		int min=9;
		int flag=0;
		for(int i=0;i<5;i++) {
			arr[i]=scn.nextInt();
			sum+=arr[i];
			if(sum%10!=0) {
				if(sum%10<=min) {
					flag=1;
					min=sum%10;
				}
			}
			sum+=sum%10!=0?10-sum%10:0;
			//System.out.println(sum);
		}
		System.out.println(sum+(flag==1?-10+min:0));
	}

}
