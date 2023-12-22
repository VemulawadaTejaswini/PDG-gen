import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int[]p = new int[M];
			String[]S = new String[M];
			int[]kuria = new int[N];//Nもんあるウチの問題ごとに０か１か
			int[]pena = new int[N];//問題ごとにペナルティが何個あったか
			//どちらも０に初期化されている
			for(int i = 0;i<M;i++) {
				p[i] = scan.nextInt();
				S[i] = scan.next();
			}
			
			Map<Integer,String> map = new HashMap<Integer,String>();
			
			for(int i = 0;i<M;i++) {
				if(!map.containsKey(p[i])) {//まだ初めて提出する問題なら含める
					map.put(p[i],S[i]);
					if(map.get(p[i]).equals("AC")) {
						kuria[p[i]-1] = 1;
					}else {
						pena[p[i]-1] = 1;
					}
				}else if(map.containsKey(p[i])) {//もうその問題は一回提出したことあるなら
					if(map.get(p[i]).equals("WA")) {//まだ間違ったままである
						if(S[i].equals("WA")) {
							pena[p[i]-1]+=1;
						}else if(S[i].equals("AC")) {
							map.put(p[i],"AC");
							kuria[p[i]-1]=1;
						}
						
					}
					//同じ問題でACは無意味なので考えない
					
				}
			}
			
			
			int kuriagoukei=0;
			int penagoukei=0;
			
			for(int i = 0;i<N;i++) {
				kuriagoukei+=kuria[i];
				penagoukei+=pena[i];
			}
			
			System.out.println(""+kuriagoukei+" "+penagoukei+"");

			
			
			
			
			
		}
		
		
	}
		

}
