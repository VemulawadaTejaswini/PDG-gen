import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
      	int C = sc.nextInt();
      int min = Math.min(A,B);
      int bar[] = new int[min];
      int co = 0;
      
      for(int i =1;i<=min;i++){
        if(A%i==0&&B%i==0){
          bar[co] = i;
          co++;
        }
      }
		System.out.print(bar[C-1]);
    }
}