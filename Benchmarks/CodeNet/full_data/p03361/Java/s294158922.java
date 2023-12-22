import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int W = sc.nextInt(); 
		List<Boolean> MAP = new ArrayList<>();
		
		for(int i = 0; i < H*W; i++){
			String a = sc.next;
			if(a.equals("#")){
				MAP.Add(true);
			}else{
				MAP.Add(false);
			}
		}
		
		for(int i = 0; i < H*W; i++){
			if(MAP.get(i)){
				//↑判定
				if(i>W){
					if(MAP.get(i-W)){
						Yes();
					}
				}
				//←
				if(i > 0 && ((i - 1)% W) != 0){
					if(MAP.get(i-1)){
						Yes();
					}
				}
				
				//→
				if(i < H*W && i % W != 0){
					if(MAP.get(i+1)){
						Yes();
					}
				}
				
				if(i < H*W - W + 1){
					if(MAP.get(i+W)){
						Yes();
					}
				}
			}
		}
		
		System.out.println("No");
	}
	
	public void Yes(){
		System.out.println("Yes");
		exit();
	}
}

















/*import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 0; i < K; i++){
			if(A > B && A > C){
				A = A*2;
			}
			if(B > A && B > C){
				B = B*2;
			}
			if(C > A && C > B){
				C = C*2;
			}
		}
		int S = A + B + C;
		System.out.println(S);
	}
}
*/