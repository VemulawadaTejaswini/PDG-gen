import java.util.Scanner;

public class Main{
	 static int N,M;
	 static int []candle;
	 static int minLength;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        candle = new int[N];
        int position = -10000;
        int flagLength = 10000;
        boolean positionFlag = true;
        for(int i=0;i<N;i++) {
        	candle[i] = sc.nextInt();
        	if(candle[i]>=0 && positionFlag) {
        		position = i-1;
        		positionFlag = false;
        	}
        }
        
        if(M!=0){
        	if(position == -10000) {
        		minLength = distanceV(candle[candle.length-M],0);
        	}else if(position==-1) {
        		minLength = distanceV(0,candle[M-1]);
        	}else{
        		int low = 0;
        		int high = 0;
        		int totalHandle;
        		int minLengthTemp = 0;
        		//判断下位
        		if(position-M<0){
        			low = 0;
        		}else{
        			low =  position - M;
        		}
        		//判断上位
        		if(position+M-1>=candle.length){
        			high = candle.length-1;
        		}else{
        			high = position+M-1;
        		}
        		//确定循环次数
        		if(candle.length>position){
        			totalHandle = position+1;
        		}else{
        			totalHandle = position;
        		}
        		
        		for(int i = low; i < totalHandle; i++) {	
        			int handleHigh = i+M-1;
        			if(handleHigh>high){
        				break;
        			}
        			minLengthTemp = lengthCandle(candle[low],candle[handleHigh]);
        			if(minLengthTemp<flagLength) {
        				flagLength = minLengthTemp;
        			}
        		}
        		
        		minLength = flagLength;
        		
        	}
        }else{
        	minLength = 0;
        }
        
        System.out.println(minLength);
        sc.close();
	 }
	 
	 private static int distanceV(int a,int b) {
        int dis = Math.abs(a-b);
        return dis;
	 }
	 
	 private static int lengthCandle (int minCandle,int maxCandle) {
	        int length = 0;
	        if(minCandle>=0 && maxCandle>=0) {
	            length = distanceV(0,maxCandle);
	        }else if(minCandle<0 && maxCandle>=0){
	            int minCandleDistance = distanceV(0,minCandle);
	            int maxCandleDistance = distanceV(0,maxCandle);
	            if(minCandleDistance <= maxCandleDistance) {
	                length = 2*minCandleDistance+maxCandleDistance;
	            }else {
	                length = minCandleDistance+maxCandleDistance*2;
	            }
	        }else {
	            length = distanceV(minCandle,0);
	        }
	        return length;
	    }
}


