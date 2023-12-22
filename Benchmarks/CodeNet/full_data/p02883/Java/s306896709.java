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
        long min = 0;
		long max = (long)Math.pow(10, 12);
        
        
        while(max>min){
          long binary = min + (max-min)/2;
          //条件判定
          boolean b;
          long sum = 0L;
          for(int i=0;i<N;i++){
            if(A.get(i)*F.get(i)>binary){
              sum += A.get(i)-binary/F.get(i);
            }
          }
          b = sum <= K;
          //幅の更新
          if(b){
            max = binary;
          }
          else{
            min = binary+1;
          }
		  //
        }
        System.out.println(min);
    }
}