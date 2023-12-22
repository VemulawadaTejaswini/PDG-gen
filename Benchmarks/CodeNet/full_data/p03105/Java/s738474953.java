import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
      	int C = sc.nextInt();
        int bar[] = new int[100];
        int ct = 0;
      
      for(int i=1;i<=100;i++){
       if(A%i==0&&B%i==0){bar[ct]=i;ct++;} 
      }
      
	System.out.print(bar[C-1]);
    }
}