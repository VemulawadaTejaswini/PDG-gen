import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		int i=1;
		while(sum<x){
			sum+=i;
			i++;
		}
		i--;
		System.out.println(i);
	}

}
