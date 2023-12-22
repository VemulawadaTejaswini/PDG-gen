import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		int answer = 0;

		for(int i = 0; i < N; i++){
			A.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			B.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++){
			C.add(sc.nextInt());
		}

		//Collections.sort(A, Comparator.reverseOrder());
		Collections.sort(A);    // 昇順
		Collections.sort(B);
		Collections.sort(C);

		Iterator<Integer> it = B.iterator();
		int count = 0;
		int countb = 0;
		//int a = A.get(count);
		HashMap<Integer, Integer> bmap = new HashMap<>();

		while(it.hasNext()){
			int b = it.next();
			if(count < A.size()){
				while(b > A.get(count)){
					//System.out.println(count);
					count++;
					if(count >= A.size()){
						break;
					}
				}
			}
			bmap.put(countb++, count);
		}

		//System.out.println(bmap);

		countb = 0;
		int tempAnswer = 0;
		for(Integer c : C){
			if(countb < B.size()){
				while(c > B.get(countb)){
					tempAnswer += bmap.get(countb);
					countb++;
					if(countb >= B.size()){
						break;
					}
				}
			}
			answer += tempAnswer;
		}

		System.out.println(answer);
	}
}