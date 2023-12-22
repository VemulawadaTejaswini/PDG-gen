import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int [] Ai = new int[N];
    double [] Gi = new double[N];
    double sum = 0;
    for(int i=0;i<N;i++){
      Ai[i] = scan.nextInt();
      Gi[i] = 1.0/Ai[i];
      sum += Gi[i];
    }
    //System.out.println(sum);
    double sum2 = 1.0/sum;
    System.out.println(sum2);
  }
}
