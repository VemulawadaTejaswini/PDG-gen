import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 1;
		while(true){
			if((n*i)%2==0){
				break;
			}
			i+=1;
		}
		System.out.println(n*i);
	}
}