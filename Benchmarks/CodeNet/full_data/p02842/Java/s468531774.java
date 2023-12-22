import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = (int)(N/1.08)-1; i < N/1.08+500; i++){
      if(i*1.08 >= N){
        if((int)(i*1.08) == N)
          System.out.println(i);
        else
          System.out.println(":(");
        break;
      }
    }
  }
}
