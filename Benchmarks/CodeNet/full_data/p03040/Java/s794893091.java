import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int q =sc.nextInt();
		PriorityQueue<Integer> sq=new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> lq=new PriorityQueue<>();
		long sumB=0;
		long sumsq=0;
		long sumlq=0;
		for(int i=0; i<q; i++){
			int x=sc.nextInt();
			if(x==1){
				int a=sc.nextInt();
				sumB+=sc.nextInt();
				sq.add(a);
				lq.add(a);
				sumsq+=a;
				sumlq+=a;
				if(sq.peek()>lq.peek()){
					int tsq=sq.poll();
					int tlq=lq.poll();
					sq.add(tlq);
					lq.add(tsq);
					sumsq+=-tsq+tlq;
					sumlq+=-tlq+tsq;
				}
			}else{
				long min=0;
				if(sq.peek()==lq.peek()){
					min=((sq.peek()*(sq.size()-1)-(sumsq-sq.peek()))+((sumlq-lq.peek())-lq.peek()*(lq.size()-1)))/2;
				}else{
					min=((sq.peek()*sq.size()-sumsq)+(sumlq-sq.peek()*sq.size()))/2;
				}
				min+=sumB;
				System.out.println(sq.peek()+" "+min);
			}
		}
	}
}

