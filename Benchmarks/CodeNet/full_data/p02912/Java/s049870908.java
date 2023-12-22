import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
      	int discount = sc.nextInt();
      	Integer[] productPrice = new int[count];
      	int temp = 0;
      	double sum = 0;
      	for(int i = 0; i < count; i++){
        	productPrice[i] = sc.nextInt();
        }
      	Arrays.sort(productPrice, Collections.reverseOrder());
      	for(int l = 1; l <= discount; l++){
        	productPrice[0] = productPrice[0] / 2;
          	for(int m = 0; m < count-1; m++){
            	if(productPrice[m] < productPrice[m+1]){
                	temp = productPrice[m];
                  	productPrice[m] = productPrice[m+1];
                  	productPrice[m+1] = temp;
                }else{
                	break;
                }
            }
        }
      	for(int n = 0; n < count; n++){
        	sum = sum + productPrice[n];
        }
      	System.out.println(BigDecimal.valueOf(sum).toPlainString());
	}
}