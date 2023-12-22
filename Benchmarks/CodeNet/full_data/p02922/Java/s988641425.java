import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b==1){
			System.out.println(0);
			return;
		}
		int count=1;
		while(true){
			if(a*count-count+1>=b){
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}
