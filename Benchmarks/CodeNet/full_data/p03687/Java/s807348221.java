import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
	String sequence = scan.nextLine();
	int seqLength = sequence.length();
	int abcVariety = 26;
	int[] eachReqTime =new int[abcVariety];
	int[] eachLastPosition = new int[abcVariety];
	for(int i = 0; i < abcVariety; i++){
	    eachReqTime[i] = 0;
	    eachLastPosition[i] = -1;
	}

	char currentChar;
	int currentIndex;
	for(int i = 0; i < seqLength; i++){
	    currentChar = sequence.charAt(i);
	    currentIndex = (int)currentChar - (int)'a';
	    int currentReqTime = i - 1 - eachLastPosition[currentIndex];
	    eachReqTime[currentIndex] = Math.max(eachReqTime[currentIndex], currentReqTime);
	    eachLastPosition[currentIndex] = i;
	}
	char lastChar = sequence.charAt(seqLength - 1);
	int lastIndex = (int)lastChar - (int)'a';
	for(int i = 0; i < abcVariety; i++){
	    if((i != lastIndex) && (eachLastPosition[i] != -1)){
		int currentReqTime = seqLength - 1 - eachLastPosition[i];
		eachReqTime[i] = Math.max(eachReqTime[i], currentReqTime);
	    }
	}
	int reqTime = seqLength;
	for(int i = 0; i < abcVariety; i++){
	    if(eachLastPosition[i] != -1){
		reqTime = Math.min(reqTime, eachReqTime[i]);
	    }
	}
	System.out.print(reqTime);
    }
}
