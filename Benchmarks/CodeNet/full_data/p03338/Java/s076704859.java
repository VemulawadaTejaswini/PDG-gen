import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	// Atcoder用のサンプルプログラム
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	 /* 
    	  * 文字の種類抜き出し
    	  * N繰り返し
    	  * i文字目で分裂
    	  * 抜き出した文字がXに含まれる　かつ　Yに含まれる
    	  * →count+1
    	  *  
    	  *  */
    	 String N = br.readLine();
    	 String S = br.readLine();
    	 int Nint = Integer.parseInt(N);
    	 String[] mozisyuryui = new String[Nint];
    	 int mozisyuruiSu=0;
    	 for (int i = 0;i < Nint;i++) {
    		 if (!Arrays.asList(mozisyuryui).contains(String.valueOf(S.charAt(i)))) {
    			 mozisyuryui[mozisyuruiSu]=String.valueOf(S.charAt(i));
    			 mozisyuruiSu++;
    		 }
    	 }
    	 
    	 int result=0;
    	 int tempCnt=0;

    	 for (int j = 0;j < Nint;j++) {
    		 for (int i = 0;i < mozisyuruiSu;i++) {
    			 String judgeMozi = mozisyuryui[i];

        		 if (S.substring(0,j).contains(judgeMozi) && S.substring(j,Nint).contains(judgeMozi)) {
        			 tempCnt++;
        		 }
        	 }
    		 if (tempCnt > result) {
    			 result = tempCnt;
    		 }
    		 tempCnt=0;
    	 }
     	System.out.println(result); 

    	 
    	 
    	 
    	//System.out.println("End!!");
    }
    
    private static int add(String a, String b) throws Exception{
    	return Integer.parseInt(a) + Integer.parseInt(b);
    }

    private static int subtract(String a, String b) throws Exception {
    	return Integer.parseInt(a) - Integer.parseInt(b);
    }
    
    private static int multiply(String a, String b) throws Exception {
    	return Integer.parseInt(a) * Integer.parseInt(b);
    }
    
    private static int divide(String a, String b) throws Exception {
    	return Integer.parseInt(a) / Integer.parseInt(b);
    }
    
    private static int pow(String a, String b) throws Exception {
    	Double result = Math.pow(Double.parseDouble(a),Double.parseDouble(a));
    	return Integer.parseInt(Double.toString(result));
    }
    
    private static String getBigger(String a, String b) throws Exception {
    	String result = b;
    	if (Integer.parseInt(a) >= Integer.parseInt(b)) {
    		result = a;
    	}
    	return result;
    }
    
    private static double getBigger(double a, double b) throws Exception {
    	double result = b;
    	
    	Double.compare(a, b);
    	if (Double.compare(a, b) > 0) {
    		result = a;
    	}
    	return result;
    }
    // 備忘録
    // int → String  String.valueOf();
    // String → int  Integer.parseInt();
    // BigDecimal → int XXX.intValue();
    // double → BigDecimal new BigDecimal(XXX);
    // setScale BigDecimalの桁まとめ 
    // nBig.setScale(0,BigDecimal.ROUND_DOWN);
    // 絶対値 → Math.abs
    
}