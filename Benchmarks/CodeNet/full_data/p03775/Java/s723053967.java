import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
      
        Long sq = (long) Math.floor(Math.sqrt(N));

      	for(long i = sq; i > 0; i--){
          	if(N%sq==0){
              if(sq>N%sq){
                System.out.println(String.valueOf(sq).length());
                return;
              }else{
                Long ans = (long) (N/sq);
                System.out.println(String.valueOf(ans).length());
                return;
              }
            }
        }
		System.out.println(String.valueOf(N).length());
	}
}
