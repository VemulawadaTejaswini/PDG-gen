import java.util.*;
 
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] A = new int[N];
      	int[] B = new int[N];
        int Asum = 0;
        int Bsum = 0;
        int difsum = 0;
        int cntdif = 0;
        for(int i=0;i<N;i++){
        	A[i] = sc.nextInt();
            Asum += A[i];
        }
      	for(int i=0;i<N;i++){
        	B[i] = sc.nextInt();
          	Bsum += B[i];
        }
      
      	if(Asum < Bsum){
        	System.out.println(0);
        }else{
          	ArrayList bigger<int> = new ArrayList<int>();
        	for(int j=0;j<N;j++){
            	if(int dif = A[j]-B[j] <0){
                	difsum += dif;
                    cnt++;
                }else if(dif > 0){
                 	bigger.add(dif);
                }
            }
          	int big[] = bigger.toArray(new int[bigger.size()]);
          	int temp;
        	for(int k = 0; k < bigger.length; k++){
            	for(int l = 0; l< bigger.length -k-1; l++){
                	if(bigger[l] > bigger[l + 1]){
                    	temp = bigger[l];
                    	bigger[l] = bigger[l + 1];
                    	bigger[l + 1] = temp;
                	}
            	}
        	}
            int m =0;
          	while(difsum <= 0){
            	difsum += bigger[m];
              	m++;
                cnt++;
            }
        }
     System.out.println(cnt);    	
     } 
}  
