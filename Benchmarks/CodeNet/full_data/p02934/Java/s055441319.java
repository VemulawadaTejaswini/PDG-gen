import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int line[] = new int[N];
      double sum =0;
    
    for(int i=0;i<N;i++){
      line[i] = sc.nextInt();
      sum += 1.0/(double)line[i];
    }
    System.out.println(1.0/sum);
  }
}