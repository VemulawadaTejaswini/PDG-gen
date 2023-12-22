import java.util.Scanner;

public class  Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    Double sum_height = 0d;
    Double tt = 0d;
    Double sub = Double.MAX_VALUE;
    int index = 0;

    for(int i=0; i<n; i++){
      tt = t - sc.nextInt() * 0.006;
      if(sub>Math.abs(tt-a)){
        sub = Math.abs(tt-a);
        index = i+1;
      }
    }
    System.out.println(index);


  }
}