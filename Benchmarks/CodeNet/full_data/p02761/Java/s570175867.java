import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int keta1 = 0;
		int keta2 = 0;
		int keta3 = 0;
      	boolean BBB = false;
		boolean[] boo = new boolean[3];
		List<Integer> C = new ArrayList<Integer>();
		for(int i = 0; i < M; i++){
          	int p = sc.nextInt();
			switch(p){
				case 1:
					if(boo[0]){
						int hoge = sc.nextInt();
						if(keta1 == hoge){
							break;
						}else{
							System.out.println(-1);
							return;
						}
					}
					keta1 = sc.nextInt();
					if(keta1 == 0){
						System.out.println(-1);
						return;
					}
					boo[0] = true;
					break;
				case 2:
					if(boo[1]){
						int hoge = sc.nextInt();
						if(keta2 == hoge){
							break;
						}else{
							System.out.println(-1);
							return;
						}
					}
					keta2 = sc.nextInt();
                	boo[1] = true;
					break;
				case 3:
					if(boo[2]){
						int hoge = sc.nextInt();
						if(keta3 == hoge){
							break;
						}else{
							System.out.println(-1);
							return;
						}
					}
					keta3 = sc.nextInt();
                	if(keta3 == 0){
                     BBB = true; 
                    }
                	boo[2] = true;
					break;
			}
		}
      	String ans = "";
		if(N == 3 && keta1 != 0){
  			ans += String.valueOf(keta1);
			ans += String.valueOf(keta2);
          	ans += String.valueOf(keta3);          
        }else if(N == 2 && keta2 != 0){
         	ans += String.valueOf(keta2);
          	ans += String.valueOf(keta3);
        }else if(N == 1 && BBB || keta3 != 0){
          	ans += String.valueOf(keta3);
        }else{
            ans = "-1"; 
        }
      	
		System.out.println(ans);
	}
}