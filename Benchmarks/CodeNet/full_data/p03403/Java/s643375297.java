import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] get = br.readLine().split(" ");
		List<Integer> A = new ArrayList<Integer>();

		A.add(0);
		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(get[i]));
		}
		A.add(0);

		int sum = 0;
		for(int i = 0;i<A.size()-1;i++){
			sum += Math.abs(A.get(i) - A.get(i+1));
		}
		for(int j = 1;j<A.size()-1;j++){
			int prev =A.get(j-1);
			int now = A.get(j);
			int next = A.get(j+1);

			if(now>=0){
				if(now<=next){
					System.out.println(sum);
				}else{
					if(prev<next){
						System.out.println(sum - (2*(now-next)));
					}else if(now>prev && prev > next){
						System.out.println(sum - (2*(now-prev)));
					}else if(now<prev){
						System.out.println(sum);
					}else{
						A.get(A.size()+1);
					}
				}
			}else{
				if(now>=next){
					System.out.println(sum);
				}else{
					if(now>prev){
						System.out.println(sum);
					}else if(next>prev && prev > now){
						System.out.println(sum - (2*Math.abs(prev-now)));
					}else if(prev>next){
						System.out.println(sum - (2*Math.abs(next-now)));
					}else{
						A.get(A.size()+1);
					}
				}
			}
		}


	}
}
