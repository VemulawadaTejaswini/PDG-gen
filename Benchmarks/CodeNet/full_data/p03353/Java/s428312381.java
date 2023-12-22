import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		sc.close();

		Queue<String> queue = new PriorityQueue<String>();

		for(int i = 0 ; i < s.length(); i++){
			for(int j = i+1 ; j <= j+5 ;j++){
				if(j > s.length()){
					break;
				}
				else{
				queue.add(s.substring(i,j));
				}
			}
		}

		String[] S = new String[s.length() * K];
		for(int i = 0 ; i < S.length ; i++){
			S[i] = queue.poll();
		}


		int count = 1;
		for(int i = 0 ; i < S.length-1 ; i++){
			if(!S[i].equals(S[i+1])){
				count++;
			}
			if(count == K){
				System.out.println(S[i+1]);
				break;
			}
		}
		if(s.length() == 1){
			System.out.println(s);
		}

	}

}
