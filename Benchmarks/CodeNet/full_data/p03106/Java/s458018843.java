import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int k=s.nextInt();
		s.close();
		int num=0;
		int count=0;
		while(count<k){
			num++;
			if((a%num==0)||(b%num==0)){
				count++;
			}
		}
		System.out.println(num);
	}
}
