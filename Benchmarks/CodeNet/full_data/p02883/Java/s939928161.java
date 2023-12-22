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
        long max = (long)A.get(0)*F.get(0)+1;
        long min = -1L; 
        
        boolean b = true;
        while(max-min>1){
          long binary = min + (max-min)/2;
          long k = K;
          post: for(int i=0;i<N;i++){
            long a = (long)A.get(i);
            long f = (long)F.get(i);
            if(a*f>binary){
              while(a*f>binary){
                a--;
                k--;
                if(k==0){
                  b = false;
                  break post;
                }
              }
            }
            else{break;}
          }
          if(b){
            max = binary;
          }
          else{
            min = binary;
          }
          binary = min + (max-min)/2;
          
          if(binary==max||binary==min){
            if(!(b)){binary++;}
            break;
          }
          b = true;
        }
        System.out.println(max);
    }
}