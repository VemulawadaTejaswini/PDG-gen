import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] H = new int[N];
    int ans = 0;
    int count = 0;
    

    
    for(int i = 0;i < N;i++){
      H[i] = sc.nextInt();
    }
    
    int max = H[0];

    for(int i = 1;i < N;i++){
      for(int ii = 1;ii < i;ii++){
        
        max = Math.max(max,H[ii]);
      }
      if(max <= H[i]){
        count++;
      }
    }
    System.out.println(count+1);
	}
}