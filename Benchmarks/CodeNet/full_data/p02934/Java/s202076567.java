import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    double s[] = new double[n];
    double answer=0;
    for(int i=0;i<n;i++){
      answer += 1/sc.nextDouble();
    }
    answer = 1/answer;
    System.out.println(answer);    
  }
}