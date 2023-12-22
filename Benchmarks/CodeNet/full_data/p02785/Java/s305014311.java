import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> H = new ArrayList<Integer>();

		for(int i=0; i<N; i++){
			H.add(sc.nextInt());
		}
		H.sort(null);;
		int diff = H.size()-K;
		long sum = 0;

		if(diff>0){
			for(int i=0; i<diff; i++){
				sum += H.get(i);
			}
		}


		System.out.println(sum);
    }
}
