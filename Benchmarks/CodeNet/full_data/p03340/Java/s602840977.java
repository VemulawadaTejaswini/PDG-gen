import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        
      int[] A;
      A=new int[N];
       
        for (int i=0;i<N;i++){
          A[i]=sc.nextInt();
        }
      
        int count=0;
        int SUM=0;
        for (int i=0;i<N;i++){
          SUM=0;
          for (int j=i;j<N;j++){
            
            if ((SUM & A[j]) == 0){
              count+=1;
              SUM=SUM+A[j];
            }else{break;}
          }
        }
         
		System.out.println(count);
	}
}