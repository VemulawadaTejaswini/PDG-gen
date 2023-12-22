import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int n = sc.nextInt();
      int count = n+1;
      
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
          if(i*j == n){
            if((i + j) < count){
              count = i + j;
            }
          }
        }
      }
      
      System.out.println(count - 2);
      
      sc.close();
    }
}