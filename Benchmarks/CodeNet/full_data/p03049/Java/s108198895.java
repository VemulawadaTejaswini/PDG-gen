import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		int countA = 0;
		int countB = 0;
		int countPair = 0;
		int countAB=0;

		for(int i=0;i<n;i++){
			String s = sc.next();
			boolean headIsB = s.startsWith("B");
			boolean tailIsA = s.endsWith("A");
			
				// System.out.println("countAB "+countAB);
			if(headIsB){
				countB++;
			}
			if(tailIsA){
				countA++;
			}
			if(headIsB&&tailIsA){
				countPair++;
			}
			int indexAB = s.indexOf("AB");
			// if(indexAB ==-1){
			// 	continue;
			// }

			while(indexAB>=0){
				countAB++;
				if(s.length()<=2){
					break;
				}
				s = s.substring(indexAB+2);
				indexAB = s.indexOf("AB");
				// System.out.println("s "+s);
				// System.out.println("indexAB "+indexAB);
			}

			System.out.println(i+" "+ countAB);

		}

		countAB += Math.min(countA,countB);
		// System.out.println(countAB);
		// System.out.println(countA);
		// System.out.println(countB);
		// System.out.println(countPair);

			if(countPair!=0 && countPair == countB && countPair==countA){
				countAB--;
			}	
		

		System.out.println(countAB);
 
	}
}
