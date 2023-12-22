import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;
		
		if(W == 1){
			System.out.println(1);
			return;
		}
		
		if(K == 1){
			if(W >= 3) ans = (int)Math.pow(2, W-2) * H;
		}
		
		ArrayList<Elm> queue = new ArrayList<Elm>();
		Elm e = new Elm();
		e.isRight = true;
		e.w = 1;
		e.h = 1;
		if(W >= 4) e.count = (int)Math.pow(2, W-3);
		else e.count = 1;
		queue.add(e);
		
		while(true){
			if(queue.size() == 0) break;
			Elm q = queue.remove(0);
			
			//System.out.println(q.w + " " + q.h + " " + q.isRight + " " + q.count);
			
			if((q.w == K - 1 && q.isRight == true) || (q.w == K + 1 && q.isRight == false)){
				ans += q.count;
				//System.out.println("count = " + q.count);
				if(ans == 1000000007) ans = 0;
			}
			
			if(q.h < H){
				if(!(q.w == 2 && q.isRight == false)){
					Elm nextQ = new Elm();
					nextQ.isRight = false;
					if(q.isRight) nextQ.w = q.w + 1;
					else nextQ.w = q.w - 1;
					nextQ.h = q.h + 1;
					
					if(nextQ.w == 1){
						if(W >= 4) nextQ.count = q.count + (int)Math.pow(2, W-3);
						else nextQ.count = q.count;
					}else{
						if(W >= 5) nextQ.count = q.count + (int)Math.pow(2, W-4);
						else nextQ.count = q.count;
					}
					
					queue.add(nextQ);
				}
				
				if(!(q.w == W - 1 && q.isRight == true)){
					Elm nextQ = new Elm();
					nextQ.isRight = true;
					if(q.isRight) nextQ.w = q.w + 1;
					else nextQ.w = q.w - 1;
					nextQ.h = q.h + 1;
					
					if(nextQ.w == W){
						if(W >= 4) nextQ.count = q.count + (int)Math.pow(2, W-3);
						else nextQ.count = q.count;
					}else{
						if(W >= 5) nextQ.count = q.count + (int)Math.pow(2, W-4);
						else nextQ.count = q.count;
					}
					
					queue.add(nextQ);
				}
			}
		}
		
		System.out.println(ans);
	}
	
	public static class Elm{
		boolean isRight;
		int w;
		int h;
		int count;
	}
}