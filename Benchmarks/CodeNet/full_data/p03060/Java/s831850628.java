import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String V = sc.nextLine();
		String C = sc.nextLine();
		sc.close();
		
		String[] Vspl = V.split(" ");
		int[] Vi = new int[N];
		String[] Cspl = C.split(" ");
		int[] Ci = new int[N];
		
		int sum = 0;
		
		for(int i = 0;i < N;i++){
			Vi[i] = Integer.parseInt(Vspl[i]);
			Ci[i] = Integer.parseInt(Cspl[i]);
			if(Vi[i] - Ci[i] >= 0){
				sum += Vi[i] - Ci[i];
			}
		}
		System.out.println(sum);
	}

}