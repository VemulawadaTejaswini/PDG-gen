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

      	int[] Narray = new int[4];
      	int devidedNumber = N;
      	for(int i = 3; i > -1; i--) {
        	int quotient = devidedNumber / (int) Math.pow(10, i);
          	Narray[3 - i] = quotient;
          	devidedNumber = devidedNumber % (int) Math.pow(10, i);
        }
      	//System.out.println(Narray[0]);
      	//System.out.println(Narray[1]);
      	//System.out.println(Narray[2]);
      	//System.out.println(Narray[3]);
      	for(int i = 3; i > -1; i--) {
        	first:while(true) {
              	if(Arrays.asList(dislikeNumberInteger).contains(Narray[i]) == false) {
                 	break; 	
                }
            	if(Arrays.asList(dislikeNumberInteger).contains(Narray[i]) && Narray[i] != 9) {
                	Narray[i] = Narray[i] + 1;
                  	continue first;
                } else if(Narray[i] == 9) {
                	Narray[i] = 0;
                  	if(Narray[i - 1] != 9) {
                  		Narray[i - 1] = Narray[i - 1] + 1;
                    } else {
                    	Narray[i - 1] = 0;
                      	if(Narray[i - 2] != 9) {
                        	Narray[i - 2] = Narray[i - 2] + 1;
                        } else {
                          	Narray[i - 2] = 0;
                      		Narray[i - 3] = Narray[i - 3] + 1;
                        }
                    }
                  	continue first;
                }
            }
        }
  
      	String answer = String.valueOf(Narray[0]) + String.valueOf(Narray[1]) + String.valueOf(Narray[2]) + String.valueOf(Narray[3]);
       	System.out.println(answer);  	
	}
}
 

 

