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
      c[i] = sc.nextInt();
    }
    int[] num = new int[N];
    for(int i=0; i<N; i++){
    	num[i] = 10;
    }
    int ans = 0;
    int numInt = 0;
    boolean isTrue = true;
    for(int i=0; i<M; i++){
      int keta = s[i] - 1; //いじる桁 0-2 配列走査するので-1
      if(num[keta] != 10 && num[keta] != c[i]){
          isTrue = false;
          break;
      } else{
        num[keta] = c[i];
      }
    }
     for(int i=0; i<N; i++){
       if(num[0] == 0) {isTrue = false; break;} else if(num[i] == 10) num[i] = 0; 
     }
     //if(N != 1 && num[0] == 0) isTrue = false;
     
     if(isTrue == false) {ans = -1;}
     else{
       for(int i=0; i<N; i++){
         if(num[0] == 0) num[0] =1;
         for(int j=N-1; j>=0; j--){
         num[i] = num[i] *10;
      	 }
       numInt += num[i];
       } 
    	ans = numInt;
     }
 
    System.out.println(ans); 
  }
}
