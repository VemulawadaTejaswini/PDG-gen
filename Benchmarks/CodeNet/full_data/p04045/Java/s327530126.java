import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int K = scanner.nextInt();
      
   		//Listにうまく変換するため
      	Integer[] dislikeNumberInteger = new Integer[K];

      	for(int i = 0; i < K; i++) {
          	dislikeNumberInteger[i] = Integer.valueOf(scanner.nextInt());
        }
     
      	for(int i = 0; i < 10; i++) {
          	int count = 0;
        	while(true) {
              	if(Arrays.asList(dislikeNumberInteger).contains(N / (int) Math.pow(10, i) - (N / (int) Math.pow(10, i + 1)) * 10) == false) {
               		first:if(count != 0) {
                   		//処理＊
                       	Integer[] digits = new Integer[4];
                      	int rest = N;
                      	for(int m = 3; m > -1; m--) {
                       		digits[m] = rest / (int) Math.pow(10, m);
                           	rest = rest % (int) Math.pow(10, m);
                      	}
                     	second:for(int k = 0; k < 10; k++) {
                       		if(Arrays.asList(dislikeNumberInteger).contains(k) == false) {
                              	for(int p = 3; p > -1; p--) {
                               		if(digits[p] != 0) {
                                   		for(int j = p - 1; j > -1; j--) {
                               				digits[j] = k;
                                		}
                                    	break second;
                                    }
                                }
                            }
                      	}
                    	N = 1 * digits[0] + 10 * digits[1] + 100 * digits[2] + 1000 * digits[3];
                    }
                  	if(N < (int) Math.pow(10, i + 1)) {
                    	System.out.println(N);
                      	return;
                    }
                  	break;
                }
              	N = N + (int) Math.pow(10, i);
              	count = count + 1;
            }
        }	
	}
}
 

 

