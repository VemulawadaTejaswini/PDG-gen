import java.util.Scanner;

public class Main(){
	public static void main(String[] args){
		int a,b,x,count=0;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		x = sc.nextInt();

		for(int i=a; i<=b; i++){
			if(i%x == 0) count++;
		}

		System.out.println(cout);
	}
}

