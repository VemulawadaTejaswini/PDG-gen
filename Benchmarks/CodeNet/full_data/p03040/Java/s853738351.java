import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		PriorityQueue<Long> sita = new PriorityQueue<>((e1,e2)->e1>e2?-1:1);
		PriorityQueue<Long> ue = new PriorityQueue<>((e1,e2)->e1<e2?-1:1);
		long sita_sum = 0;
		long ue_sum = 0;
		long b_sum = 0;
		for(int i=0;i<q;i++) {
			if(in.nextInt()==1) {
				long a = in.nextInt();
				long b = in.nextInt();
				b_sum += b;
				if(sita.isEmpty()&&ue.isEmpty()) {
					sita.add(a);
					sita_sum += a;
				}
				else if(ue.isEmpty()) {
					if(a<sita.peek()) {
						long tmp = sita.poll();
						ue.add(tmp);
						ue_sum += tmp;
						sita.add(a);
						sita_sum += a - tmp;
					}else {
						ue.add(a);
						ue_sum += a;
					}
				}
				else {
					if(sita.size()>ue.size()) {
						if(a<sita.peek()) {
							long tmp = sita.poll();
							ue.add(tmp);
							ue_sum += tmp;
							sita.add(a);
							sita_sum += a - tmp;
						}else {
							ue.add(a);
							ue_sum += a;
						}
					}else if(sita.size()==ue.size()) {
						if(a<=ue.peek()) {
							sita.add(a);
							sita_sum += a;
						}else {
							long tmp = ue.poll();
							sita.add(tmp);
							sita_sum += tmp;
							ue.add(a);
							ue_sum += a - tmp;
						}
					}
					
				}
			}else {
				if(sita.size()==ue.size()) {
					System.out.println(sita.peek()+" "+(ue_sum-sita_sum+b_sum));
				}else {
					System.out.println(sita.peek()+" "+(ue_sum-sita_sum+sita.peek()+b_sum));
				}
				
			}
		}
		in.close();

	}

}
