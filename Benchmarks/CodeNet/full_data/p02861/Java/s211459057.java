import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[][] array = new int[n][2];
    double sum =0;

    for(int i=0; i<n; i++){
      array[i][0] = sc.nextInt();
      array[i][1] = sc.nextInt();
    }

    for(int i=0; i<n-1;i++){
      for(int j=1; j<n; j++){
        sum += Math.sqrt((array[i][0]-array[j][0])*(array[i][0]-array[j][0])+(array[i][1]-array[j][1])*(array[i][1]-array[j][1]));
      }
    }

    sum = sum * (n-1);

    System.out.println(sum/n);

  }
}