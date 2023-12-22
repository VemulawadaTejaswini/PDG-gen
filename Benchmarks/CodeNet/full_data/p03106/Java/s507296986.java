import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int k = sc.nextInt();
      
      int c;
      
      if(b > a){
        c = a;
       	a = b;
       	b = c;
      }
      
      int count = 0;
      
      for(int i = 1; i <= b; i++){
        if(a % i == 0 && b % i == 0)
        count++;
      }
      
      int[]d = new int[count];
      
      for(int i = 0,j = 1; i < count; i++,j++){
        if(a % j == 0 && b % j == 0){
          d[i] = j;
        }
      }
      
     
     System.out.println(d[k-1]);
      
    }
}