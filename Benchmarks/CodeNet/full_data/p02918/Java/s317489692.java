import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		int K = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		ArrayList<Integer> al = new ArrayList<>();
		char[] c = sc.next().toCharArray();
		int temp = 1;
		for(int i=0; i<N-1;i++){
			if (c[i] == c[i+1]){temp += 1;}
			else{
				al.add(temp);
				temp = 1;
			}
		}
		al.add(temp);
		int Ans = 0;
		if(al.size()<K*2+1){Ans = N-1;}
		else{
			for(int i = K; i<=al.size()-K-1 ;i++){
				temp = 0;
				for(int j = -K;j<=K;j++){
					temp += al.get(i+j);
				}
                for(int j=0;j<i-K;j++){
                    temp += al.get(j)-1;
                }
                for(int j=i+K+1;j<al.size();j++){
                    temp += al.get(j)-1;
                }
				pq.add(temp);
			}
			Ans = pq.poll()-1;
		}
		System.out.println(Ans);
	}
}
