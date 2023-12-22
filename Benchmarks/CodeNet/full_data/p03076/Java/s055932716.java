import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tmp;
		int sum = 0;
		int [] a = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length - 1; i++) {
            for(int j = a.length - 1; i < j; j--) {
            	if(a[i] >= 100) {
                	if(a[j-1]%100 > a[j]%100) {
                		tmp = a[j-1];
                		a[j-1] = a[j];
                		a[j] = tmp;
                	}
                }else {
                	if(a[j-1]%10 > a[j]%10) {
                		tmp = a[j-1];
                		a[j-1] = a[j];
                		a[j] = tmp;
                	}
                }
            }  
		}
		
 		for(int i = 1; i < a.length; i++) {
 			tmp = a[i] % 10;
 			if(tmp == 0) {
 				sum += a[i];
 			}else if(tmp >= 5){
 	            sum += (a[i]/10 + 1) * 10;
 	        }else{
 	            sum += (a[i]/10) * 10 + 10;
 	        }
 		}
	 	
 		System.out.println(sum + a[0]);
	}

}
