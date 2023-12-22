import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> seq = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			seq.add(sc.nextInt());
		}
		
		ArrayList<Integer> medSeq = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			for(int a = 0; a < n - i; a++) {
				ArrayList<Integer> tempSeq = new ArrayList<>();
				
				for(int b = a; b <= a + i; b++) {
					tempSeq.add(seq.get(b));
				}
				
				tempSeq.sort(null);
				
				medSeq.add(tempSeq.get((i + 1) / 2));
			}
		}
		
		medSeq.sort(null);
		int medMed = medSeq.get(medSeq.size() / 2);
		
		System.out.println(medMed);
		
	}

}