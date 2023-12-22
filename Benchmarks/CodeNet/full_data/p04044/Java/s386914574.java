import java.util.*;
public class Main {
   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        int n = arr.length;  
        String temp = "";  
         for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                  
                    String cmp1 = arr[j-1];
                    String cmp2 = arr[j];
                        for (int c = 0; c < L; c++) {
                            char r1 = cmp1.charAt(c);
                            char r2 = cmp2.charAt(c);
                            if (r1 > r2) {
                                //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                                 break;
                            }
                        }

                         
                 
                      
             }  
         }  

         String rslt = "";
        for(int i = 0; i < arr.length; i++) {
            rslt += arr[i];
        } 
        System.out.println(rslt);
    }
}	