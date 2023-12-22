import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		String [] St = S.split("");
		
		int [] Left = new int [N+2];
		int[] Right = new int [N+2];
		
		int count =0;
		for (int i=0; i<N; i++){
			if (St [i].equals("W"))
				count++;
			Left [i+1]=count;
		}
		Left[0]=0;
		Left[N+1]=count;
		
		count = 0;
		for (int i=N; i>0; i--){
			if (St[i-1].equals("E"))
				count++;
			Right [i]=count;
		}
		Right[0]=count;
		Right[N+1]=0;
		
		int min = 1_000_000_007;
		for (int i=1; i<N+1; i++){
			min = Math.min(min, Left[i-1]+Right[i+1]);
		}
	
		System.out.println(min);

	}

}