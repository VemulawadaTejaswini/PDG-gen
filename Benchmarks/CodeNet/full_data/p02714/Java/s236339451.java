import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        String RGB = sc.next();
        long cnt = (long) 0;

      	for(int i=0; i<N-2;  i++){
          for(int j=i+1; j<N-1;  j++){
            for(int k=j+1; k<N;  k++){
              if((RGB.charAt(i)!=RGB.charAt(j))&&(RGB.charAt(i)!=RGB.charAt(k))&&(RGB.charAt(j)!=RGB.charAt(k))){
                if((k-j)!=(j-i)){
                  cnt++;
                }
              }
            }
          }
        }
      
      	System.out.println(cnt);
        return;
	}
}
