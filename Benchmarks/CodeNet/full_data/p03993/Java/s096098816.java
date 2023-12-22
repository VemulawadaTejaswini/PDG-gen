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
        if(rabbit[rabbit[i]-1]-1 ==i) count++;
    }
    System.out.println(count/2);
  }
}
