import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int n = s.length();
		int gbcou = 0;
		int gwcou = 0;
		int kbcou = 0;
		int kwcou = 0;
		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(s.substring(i,i+1));
			if(i%2==0){
				if(tmp == 0){
					gbcou++;
				}else{
					gwcou++;
				}
			}else{
				if(tmp == 0){
					kbcou++;
				}else{
					kwcou++;
				}
			}
		}
		int gk = 0;
		int kk = 0;
		int gkk = 0;
		int kkk = 0;
		if(kbcou >= kwcou){
			kk = 1;
			kkk = kbcou-kwcou;
		}else{
			kk = 0;
			kkk = kwcou-kbcou;
		}
		if(gbcou >= gwcou){
			gk = 1;
			gkk = gbcou-gwcou;
		}else{
			gk = 0;
			gkk = gwcou-gbcou;
		}
		if(gk != kk){
			System.out.print(Math.min(kbcou,kwcou)+Math.min(gbcou,gwcou));
		}else{
			if(gkk >= kkk){
				kk = 1 - kk;
			}else{
				gk = 1 - gk;
			}
			System.out.print((kk == 0?kbcou:kwcou)+(gk == 0?gbcou:kwcou));
		}
	}
}
