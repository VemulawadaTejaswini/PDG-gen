import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	double N = (double) scanner.nextInt();
      	int intN = (int) N;
      
      	double taxExcluded = N / 1.08;
      	//System.out.println(taxExcluded);
      	int intTaxExcluded = (int) Math.round(taxExcluded);
      	//System.out.println(intTaxExcluded);
      	double validate = (double) intTaxExcluded * 1.08;
      	//System.out.println(validate);
      	int intValidate = (int) validate;
      	double validate2 = (double) (intTaxExcluded + 1) * 1.08;
      	int intValidate2 = (int) validate2;
      	double validate3 = (double) (intTaxExcluded - 1) * 1.08;
      	int intValidate3 = (int) validate3;
      	if(intN != intValidate) {
          	//System.out.println(intN);
          	//System.out.println(intValidate);
      		if(intN != intValidate2) {
            	if(intN != intValidate3) {
           			System.out.println(":(");
          			return;
                }
              	System.out.println(intValidate3);
              	return;
            }
        	System.out.println(intValidate2);
          	return;
        }
      	System.out.println(intTaxExcluded);
      	
	}
}
 

 

