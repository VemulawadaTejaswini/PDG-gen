import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int sum = 0;
		for(int i=0;i<=a;i++){
			for(int j=0;j<=a;j++){
				if(b-i-j<=a&&b-i-j>=0)
					sum++;
			}
		}
		System.out.println(sum);
	}
}
