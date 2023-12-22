import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int[] inputNum = new int[6];
 
		for(int i = 0 ; i < inputNum.length; i++) {
			inputNum[i] = sc.nextInt();
		}
    	
      	int min = inputNum[0];
      	int max = inputNum[0];
       	for(int i = 0 ; i < inputNum.length; i++) {
			if(inputNum[i] <= min){
            	min = inputNum[i];
            }
            if(inputNum[i] >= max){
            	max = inputNum[i];
            }
		}
      
      	if(max-min > inputNum[5]){
        	System.out.print("Yay!"); 
        }else{
        	System.out.print(":(");
        }
    }
}