import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
		ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> F = new ArrayList<>();
        for(int i=0;i<N;i++){
          A.add(sc.nextInt());
        }
        for(int i=0;i<N;i++){
          F.add(sc.nextInt());
        }
        Collections.sort(A,Comparator.reverseOrder());
        Collections.sort(F);
      
        //二分探索
        //初期化
        long max = (long)A.get(0)*F.get(0)+1;
        long min = -1L; 
        
        
        while(max-min>1){
          long binary = min + (max-min)/2;
          //条件判定
          boolean b = true;
          long sum = 0L;
          for(int i=0;i<N;i++){
            if(A.get(i)*F.get(i)>binary){
              sum += (A.get(i)*F.get(i)-binary+F.get(i)-1)/F.get(i);
            }
            else{break;}
          }
          b = sum <= K;
          //幅の更新
          if(b){
            max = binary;
          }
          else{
            min = binary;
          }
          binary = min + (max-min)/2;
		  //
        }
        System.out.println(max);
    }
}