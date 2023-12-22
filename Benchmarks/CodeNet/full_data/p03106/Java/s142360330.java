import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int cnt = 0;
      	int saisyu =0;
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	int K = sc.nextInt();
      	if(A>B){
      	for(int i=1;i<B+1;i++){
        	if(A%i==0 &&B%i==0){
            	cnt++;
            }
          	if(cnt == K){
              	saisyu = i;
            	break;
            }
        }
          System.out.println(saisyu); 
        }else{
        for(int i=1;i<A+1;i++){
        	if(A%i==0 &&B%i==0){
            	cnt++;
            }
          	if(cnt == K){
              	saisyu = i;
            	break;
            }
        }
          System.out.println(saisyu); 
        }
		     
      
    }
}