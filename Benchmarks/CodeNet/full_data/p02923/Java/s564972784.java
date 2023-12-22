import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int N = sc.nextInt();
      	int[] number = new int[N];
      	int[] cnt = new int[N];
      
      	int flag = 0;
     	int max = 0; 
		for(int i = 0;i<N;i++){
          	number[i] = sc.nextInt();
          	cnt[i] = 0;
        }
    	

      	for(int i = 0; i <N;i++){
          	for(int j = i;j<N-1;j++){
              	if(number[j] >= number[j+1]){
                  	cnt[i]++;
                }else{
                  	break;
                }
            }
        }
      
      
      
        for(int i = 0;i<N;i++){
          	if(max <= cnt[i]){
              	max = cnt[i];
            }
        }
      	System.out.println(max);
	}
}