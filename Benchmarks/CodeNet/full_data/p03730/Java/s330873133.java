import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int	A = sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		int[] array = new int[B];
		for(int i=0;i<100;i++) {
			if((A*(i+1))%B==C) {
				System.out.println("YES");
				break;
			}else {
				if(array[(A*(i+1))%B]==1) {
					System.out.println("NO");
					break;
				}
				array[(A*(i+1))%B] = 1;
			}
		}
	}
	public static int sample() {
		return 1;
	}

}
