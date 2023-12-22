import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//		String linea = bf.readLine();
		int caso = Integer.parseInt(bf.readLine());

		PriorityQueue<Integer> Pq0 = new PriorityQueue<>();
		PriorityQueue<Integer> PQ1 = new PriorityQueue<>();
		for(int i =0; i<caso;i++){
			if(i%2==0){
				Pq0.add(Integer.parseInt(bf.readLine()));

			}
			else{
				PQ1.add(Integer.parseInt(bf.readLine()));
			}
		}int i=0,rta=0; 
		while(!Pq0.isEmpty() && !PQ1.isEmpty()){
			if(i%2==0){
				if(Pq0.peek()<PQ1.peek()){
					Pq0.poll();
					i++;
				}
				else{
					int temp = PQ1.poll();
					PQ1.add(Pq0.poll());
					Pq0.add(temp);rta++;
				}
			}
			else{
				if(PQ1.peek()<Pq0.peek()){
					PQ1.poll();
					i++;
				}
				else{
					int temp = PQ1.poll();
					PQ1.add(Pq0.poll());
					Pq0.add(temp);rta++;
				}
			}
			
		}
		System.out.println(rta);
		
	}


}

