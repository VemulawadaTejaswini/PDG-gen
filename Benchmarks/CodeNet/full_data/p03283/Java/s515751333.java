import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		try {
			String NMQ = reader.readLine();
			String[] NMQ_sp = NMQ.split(" ");
			int N = Integer.parseInt(NMQ_sp[0]);
			int M = Integer.parseInt(NMQ_sp[1]);
			int Q = Integer.parseInt(NMQ_sp[2]);
			int[] L = new int[M];
			int[] R = new int[M];
			int[] p = new int[Q];
			int[] q = new int[Q];
			int[] count = new int[Q];
			
			for(int i = 0; i < M; i++) {
				String LR = reader.readLine();
				String[] LR_sp = LR.split(" ");
				L[i] = Integer.parseInt(LR_sp[0]);
				R[i] = Integer.parseInt(LR_sp[1]);		
			}
			
			for(int i = 0; i < Q; i++) {
				String pq = reader.readLine();
				String[] pq_sp = pq.split(" ");
				p[i] = Integer.parseInt(pq_sp[0]);
				q[i] = Integer.parseInt(pq_sp[1]);	
				count[i] = 0;
			}
			
			for(int i = 0; i < Q; i++) {
				for(int j = 0; j < M; j++) {
					if((p[i] <= L[j]) && (R[j] <= q[i])) {
						count[i]++;
					}
				}
				System.out.println(count[i]);
			}		
					
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
