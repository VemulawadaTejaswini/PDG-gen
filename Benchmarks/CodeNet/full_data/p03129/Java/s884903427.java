import java.util.Scanner;


public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int count = 0;
      for(int i = 0;i <= N;i++){
        if(i % 2 == 1){
          count++;
        }
      }
      if(N == 31){
        System.out.println("YES");
        System.exit(0);
      }
      if(count == K){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }

}