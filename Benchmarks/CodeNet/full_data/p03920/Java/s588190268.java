import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		int i=0;
		int max;
		while (true){
			if(i*(i+1)/2 >= n){
				max = i;
				break;
			}
			i++;
		}
		
		for(int j=max; j>0; j--){
			if(n >= j){
				System.out.println(j);
				n -= j;
			}
		}

	}

}
