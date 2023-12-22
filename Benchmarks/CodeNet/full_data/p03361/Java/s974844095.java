import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static String[][] aaa;

	public static void main(String[] args) throws IOException {
		method1();
	}
	
//	public static List<String> method2(String[][] a, int i, int j){
//		List<String> b = new ArrayList<String>();
//		
//		for(int k = 0; k < 4; k++){
//			try{
//				switch(k){
//					case 0:
//						b.add(a[i][j-1]);
//						//System.out.println(0);
//						break;
//						
//					case 1:
//						b.add(a[i-1][j]);
//						//System.out.println(1);
//						break;
//						
//					case 3:
//						b.add(a[i+1][j]);
//						//System.out.println(2);
//						break;
//						
//					case 4:
//						b.add(a[i][j+1]);
//						//System.out.println(3);
//						break;
//				}
//			}
//			catch(Exception e){
//				k++;
//			}
//		}
//		
//		return b;
//	}
	
	public static boolean method3(int i, int j){
		boolean b = false;
		
		int w = aaa[0].length;
		int h = aaa.length;
		final String c = "#";
		
		for(int k = 0; k < 4; k++){
			if(j == 0 && k == 0) continue;
			if(i == 0 && k == 1) continue;
			if(i == (h - 1) && k == 2) continue;
			if(j == (w - 1) && k == 3) continue;
			
			switch(k){
				case 0: if(aaa[i][j-1].equals(c)) b = true; break;
				case 1: if(aaa[i-1][j].equals(c)) b = true; break;
				case 2: if(aaa[i+1][j].equals(c)) b = true; break;
				case 3: if(aaa[i][j+1].equals(c)) b = true; break;
			}
			
			if(b) break;
		}
		
		return b;
	}
	
	public static void method1() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] wh = str.split(" ");
		
		int h = Integer.parseInt(wh[0]);
		int w = Integer.parseInt(wh[1]);
		
		aaa = new String[h][w];
		
		for(int i = 0; i < h; i++){ aaa[i] = br.readLine().split(""); }
		
		boolean flg = true;
		boolean finFlg = false;
		boolean flg2 = false;
		
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(aaa[i][j].equals(".")) continue;
				
				if(!flg2) flg2 = true;
				
				flg = method3(i, j);
				
				//System.out.println(String.format("%2d, %2d, %s", i, j, String.valueOf(flg)));
				
				if(!flg){ finFlg = true; break; }
			}
			
			if(finFlg) break;
		}
		
		System.out.println(flg || flg2 ? "Yes" : "No");
	}
}
