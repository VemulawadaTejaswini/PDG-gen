import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int n = sc.nextInt();
          	int[] a = new int[n];
          
          	for (int i = 0; i<a.length; i++){
              a[i] = sc.nextInt();
            }
          
            int result = 0;
          	for (int i = 0; i<a.length; i++){
              for (int j = i + 1; j<a.length; j++){
                for (int k = j + 1; k<a.length; k++){
                	if(a[i] + a[j] > a[k] && a[j] + a[k] > a[i] && a[i] + a[k] > a[j]){
                  	    result++;
                    }  
                }                  
              }
            }
          	
          	
              
          
    		// 出力
    		System.out.println(result);
    	}
    }