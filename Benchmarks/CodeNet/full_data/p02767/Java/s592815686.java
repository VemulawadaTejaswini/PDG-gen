import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    double[] array = new double[n];
    int ave = 0;
    int sum = 0;
    for(int i = 0; i < n; i++){
      array[i] = sc.nextDouble();
      ave += array[i];
    }
    ave = (ave/array.length) + 1;
    for(int i = 0; i < array.length; i++){
      sum += Math.pow(Math.abs(array[i]-ave),2);
    }
    System.out.println(sum);
  }
}
