import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int kaisu=0;
		// 要素数の入力
		int kazu = sc.nextInt();
		// 配列の準備
		int A[] = new int[kazu];
		int B[] = new int[kazu];
		// 数列の入力
		for(int i=0;i<kazu;i++){
          A[i] = sc.nextInt();
        }
      	for(int i=0;i<kazu;i++){
          B[i] = sc.nextInt();
        }
      	//BのMAX値を求める
		int bmax = B[0];
      	int bmaxnumber = 0;
		for (int i = 1; i < kazu; i++) {
    		int v = B[i];
    		if (v > bmax) {
        		bmax = v;
              	bmaxnumber = i;
    		}
		}
		//Bの中で最大の数からその前後を引いていく
      	while(A[bmaxnumber]<B[bmaxnumber]){
          if(bmaxnumber==0){
            B[bmaxnumber]=B[bmaxnumber]-B[bmaxnumber+1]-B[kazu-1];
          }else if(bmaxnumber==kazu-1){
            B[bmaxnumber]=B[bmaxnumber]-B[0]-B[bmaxnumber-1];
          }else{
         	B[bmaxnumber]=B[bmaxnumber]-B[bmaxnumber+1]-B[bmaxnumber-1];
          }
          bmax = B[0];
      	  bmaxnumber = 0;
          for (int i = 1; i < kazu; i++) {
    		int v = B[i];
    		if (v > bmax) {
        			bmax = v;
              		bmaxnumber = i;
    			}
			}  
          kaisu++;
        }
         
          
          
        
      
      if(A[0]==B[0]){
    
      // 出力
    	 System.out.println(kaisu);
      }else{
      System.out.println(-1);
      }
	}
}