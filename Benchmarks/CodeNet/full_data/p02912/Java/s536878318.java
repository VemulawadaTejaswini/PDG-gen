import java.util.*;
 
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
      	int discount = sc.nextInt();
      	int[] productPrice = new int[count];
      	int temp = 0;
      	int sum = 0;
      	for(int i = 0; i < count; i++){
        	productPrice[i] = sc.nextInt();
        }
      	for(int j = 0; j < count-1; j++){
        	for(int k = 0; k < count-1; k++){
        		if(productPrice[k] < productPrice[k+1]){
                	temp = productPrice[k];
                  	productPrice[k] = productPrice[k+1];
                  	productPrice[k+1] = temp;
                }
        	}
        }
      	for(int l = 0; l < discount; l++){
        	productPrice[0] = productPrice[0] / 2;
          	for(int m = 0; m < count-1; m++){
            	if(productPrice[m] < productPrice[m+1]){
                	temp = productPrice[m];
                  	productPrice[m] = productPrice[m+1];
                  	productPrice[m+1] = temp;
                }
            }
        }
      	for(int n = 0; n < count; n++){
        	sum += productPrice[n];
        }
      	System.out.println(sum);
	}
}