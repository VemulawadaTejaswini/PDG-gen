import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		int H = Integer.parseInt(ss0[0]);
		int W = Integer.parseInt(ss0[1]);

		String[][] ss2 = new String[H][W];
		for(int h = 0; h < H; h++){
			ss0 = br.readLine().trim().split("", 0);
			for(int w = 0; w < W; w++){
				ss2[h][w] = new String(ss0[w]);
			}
		}


					////入力値確認
					//for(int m = 0; m < H; m++){
					//	for(int n = 0; n < W; n++){
					//		//System.out.print("[" + ss2[m][n] + "]");
					//	}
					//	System.out.println("");
					//}


		//進んだ後に、戻った跡があるとアウト
		int x = 0;
		int y = 0;
		boolean b = true;
		for(int h = 0; h < H; h++){
			for(int w = 0; w < W; w++){
				if (ss2[h][w].equals("#")){
					if(w < y){ 
						b = false;
					}else{
						y = w;
					}
					if(h < x){
						b = false;
					}else{
						x = h;
					}
				}
				if(b){}else{ break; }
			}
			if(b){}else{ break; }
		}

		if (b) {
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
        //System.out.println(iCount + " " + s);
        return;
    }
    // Debug.Print
    static void dp(String s) {
		System.out.println(s);
	}
    static void dp(StringBuilder s) { dp(s.toString()); }
    static void dp(int i) { dp(String.valueOf(i)); }
    static void dp(long i) { dp(String.valueOf(i)); }

}
