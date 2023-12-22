import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int max = 0;
      
      for(int i=0; i<=N; i++){
        if(i*i > N){
          break;
        }
        if(i*i >= max){
          max = i*i;
        }
      }
      System.out.println(max);
    }
}