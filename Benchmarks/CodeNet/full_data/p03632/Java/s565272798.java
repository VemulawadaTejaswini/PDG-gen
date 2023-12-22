import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int A,B,C,D;
    int count = 0;

    A = s.nextInt();
    B = s.nextInt();
    C = s.nextInt();
    D = s.nextInt();
    for(int time = 0; time <= 100 ; time++){
      boolean ab = false,cd = false;
      if(time >= A && time < B)ab = true;
      if(time >= C && time < D)cd = true;
      if(ab && cd)count++;
    }
    //if(C <= A && D <= A)
    //if(C >= B && D >= B)
    //if()
    System.out.printf("%d",count);
  }
}
