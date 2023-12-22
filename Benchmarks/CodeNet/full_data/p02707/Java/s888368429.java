import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int n[]=new int[num];
		
		for(int i=0;i<num-1;i++) {
			int a=sc.nextInt()-1;
			n[a]+=1;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(n[i]);
		}
		sc.close();
		
	}

}