import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int N = n;
		for(int i=0;i<111;i++){
			if((n+i)%111==0){
				System.out.println(n+i);
				break;
			}
		}
	}
}
