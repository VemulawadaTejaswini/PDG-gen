import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N];
    int max = 0;
    int min = 0;
    for(int i=0; i<N; i++){
      x[i] = sc.nextInt();
      if(i == 0){ max = x[i]; min = x[i];}
      else{
        if(x[i] > max) { max = x[i];}
        if(x[i] < min) { min = x[i];}
      }
    }
  }
}
