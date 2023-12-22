import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] digit=new int[5];
		int cnt=0;
		for(int i=a;i<=b;i++) {
			digit[0]=i/10000%10;
			digit[1]=i/1000%10;
			digit[3]=i/10%10;
			digit[4]=i%10;
			if(digit[0]==digit[4] && digit[1]==digit[3])	cnt++;
		}
		System.out.println(cnt);
	}

}