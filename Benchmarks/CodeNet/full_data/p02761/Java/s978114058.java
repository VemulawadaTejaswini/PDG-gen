import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];
    for(int i=0; i<M; i++){
      s[i] = sc.nextInt();
      c[i] = sc.nextint();
    }
    int[] num = new int[N];
    for(int i=0; i<N; i++){
    	num[i] = 0;
    }
    int ans = 0;
    int numInt = 0;
    boolean isTrue = true;
    if(int i=0; i<M; i++){
      int keta = s[i] - 1; //いじる桁 0-2 配列走査するので-1
      if(num[keta] != 0 && num[keta] != c[i]){
          isTrue = false;
          break;
      } else{
        num[keta] = c[i];
      }
    }
     if(num[0] == 0) isTrue = false;
     
     if(isTrue == false) {ans == -1;}
     else{
       for(int i=0; i<N; i++){
         for(int i=N-1; i>=0; i--){
         num[i] = num[i] *10; 
         numInt += num[i]; 
      	 }
       } 
    	ans = numInt;
     }
 
    System.out.println(ans); 
  }
}
