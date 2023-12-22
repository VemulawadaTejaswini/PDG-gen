import java.util.*;

public class Main {

	static int Examine(int countM,int countA,int countR,int countC,int countH) {
		int count = 0;
		count += countR * countC * countH;
		count += countA * countC * countH;
		count += countA * countR * countH;
		count += countA * countR * countC;
		
		count += countM * countC * countH;
		count += countM * countR * countH;
		count += countM * countR * countC;
		
		count += countM * countA * countH;
		count += countM * countA * countC;
		
		count += countM * countA * countR;

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] names = new String[N];
		int countM = 0;
		int countA = 0;
		int countR = 0;
		int countC = 0;
		int countH = 0;
		String[] I = new String[N];
		for(int i = 0;i < N;i++) {
			names[i] = sc.next();
			I[i] = names[i].substring(0,1);
		}
		for(int k = 0;k < N;k++) {
			if(I[k].equals("M")) countM++;
			else if(I[k].equals("A")) countA++;
			else if(I[k].equals("R")) countR++;
			else if(I[k].equals("C")) countC++;
			else if(I[k].equals("H")) countH++;
		}
		System.out.println(Examine(countM,countA,countR,countC,countH));
		sc.close();
	}

}
