import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int[] inputNum = new int[5];
 
		for(int i = 0 ; i < inputNum.length; i++) {
			inputNum[i] = sc.nextInt();
          //コードテスト用
          	//System.out.println(inputNum[i]);
		}
      	
      	int lastOrder = 0;
      	int remainderMax = inputNum[0] % 10;

      	for(int j = 0 ; j < inputNum.length; j++){
        	int k = inputNum[j] % 10;
          	if(k < remainderMax && k!= 0){
            	lastOrder = j;
            }
        }
      	//test
        //System.out.println(lastOrder);
      	
      	
    	
    }
}