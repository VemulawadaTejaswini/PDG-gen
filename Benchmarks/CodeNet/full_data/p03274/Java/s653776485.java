import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int K;
	static String[] candles;
	static long total = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
//		long startTime = System.currentTimeMillis();
//      String url = Main.class.getResource("").getPath();
//      System.setIn(new FileInputStream(url + "test.txt"));
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufReader.readLine();
        String[] lineArr = line.split(" ");
        N = Integer.parseInt(lineArr[0]);
        K = Integer.parseInt(lineArr[1]);
        line = bufReader.readLine();
        candles = line.split(" ");
    	
        double startIndex = -1;
    	
    	//第一个数大于等0
    	if (0 <= Integer.parseInt(candles[0])){
    		total = Integer.parseInt(candles[K-1]);
    	}
    	//第一个数小于0
    	else{
    		if (0 >= Integer.parseInt(candles[candles.length-1])){
    			total = - Integer.parseInt(candles[candles.length - K]);
    		}
    		else{
    			//第一个数小于0， 最后一个数大于0
    			for (int i=1; i<candles.length-1; i++){
    	        	if (0 == Integer.parseInt(candles[i])){
    	        		startIndex = i;
    	        		break;
    	        	}
    				if (Double.parseDouble(candles[i])*Double.parseDouble(candles[i+1]) < 0){
    	        		startIndex = i + 0.5;
    	        		break;
    	        	}
    	        }
    			int begin = (int)(startIndex - K) < 0 ? 0 : (int)(startIndex - K) + 1
    					, end = (int)startIndex + ((startIndex+"").indexOf(".5") > -1 ? K :K-1) > N-1 ? N-1 : (int)startIndex + ((startIndex+"").indexOf(".5") > -1 ? K :K-1);
    			for (int i=begin; i+K-1 <= end; i++){
    				long result = 0;
    				
    				if (i < startIndex && i+K-1 > startIndex){
    					long a = Integer.parseInt(candles[i+K-1]) - 2*Integer.parseInt(candles[i]);
    					long b = 2*Integer.parseInt(candles[i+K-1]) - Integer.parseInt(candles[i]);
    					result = Math.min(a, b);
    				}
    				if (i >= startIndex){
    					result = Integer.parseInt(candles[i+K-1]);
    				}
    				if (startIndex >= i+K-1){
    					result = - Integer.parseInt(candles[i]);
    				}
    				total = Math.min(total, result);
    			}
    		}
    	}
    	System.out.println(total);
//    	long endTime = System.currentTimeMillis();
//      System.out.println(endTime - startTime);
	}
}
