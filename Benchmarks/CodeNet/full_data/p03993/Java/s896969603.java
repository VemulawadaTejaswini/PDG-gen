import java.util.Scanner;
import java.io.IOException;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] rabbit = new int[N];
    for(int i=0;i<N;i++){
      rabbit[i] = scan.nextInt();
    }
    int count=0;
    for(int i=0;i<rabbit.length;i++){
      for(int j=0;j<rabbit.length;j++){
        if(i != j && i == rabbit[j]-1 && rabbit[i]-1 == j) count++;
      }
    }
    System.out.println(count/2);
  }
}
