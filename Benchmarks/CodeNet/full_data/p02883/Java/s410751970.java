import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		// 文字列の入力
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
      for(int i = 0; i < a; i++){
			e[i] = sc.nextInt();
		} 
		Arrays.sort(d);
		Arrays.sort(e);
		long f = 0;
		long g = d[a - 1] * e[a - 1];
      //System.out.println(g);
		long h = (f + g) / 2;
		long i = 0;
		while(f != h ){
          i = 0;
			for(int j = 0; j < a; j++){
				if(d[j] - h / e[a - j - 1] > 0){
					i += d[j] - h / e[a - j - 1];
                  
				}
              System.out.println(d[j] - h / e[a - j - 1] + "and" + h);
			}
			if(i > b){
				f = h;
				h = (f + g) / 2;
              System.out.println(i);
			}else{
            	g = h;
                h = (f + g) / 2;
            }
          
      //System.out.println(g);
		}
      i = 0;
			for(int j = 0; j < a; j++){
				if(d[j] - h / e[a - j - 1] > 0){
					i += d[j] - h / e[a - j - 1];
                  
				}
              System.out.println(d[j] - h / e[a - j - 1] + "and" + h);
			}
      if(i > b){
              System.out.println(h + 1);
			}else{
              System.out.println(h);
            }
		
		
	}
}