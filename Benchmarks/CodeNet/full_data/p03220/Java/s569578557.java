import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt( scanner.next() );
    int t = Integer.parseInt( scanner.next() );
    int a = Integer.parseInt( scanner.next() );

    double[] save = new double[n];
    for(int i = 0; i<n; i++){
      save[i] = a - (t - 0.006*Integer.parseInt( scanner.next() ));
      if(save[i] < 0){
        save[i] = -save[i];
      }
    }

    int minpoint = 1;
    double min = save[0];
    for(int i = 1; i < n; i++){
      if(min > save[i]){
        minpoint = i+1;
      }
    }

    System.out.println(minpoint);
  }
}