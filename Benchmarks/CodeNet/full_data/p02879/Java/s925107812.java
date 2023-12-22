import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String[] data = str.split(" ");
    int[] score = new int[2];
    score[0] = Integer.parseInt(data[0]);
    score[1] = Integer.parseInt(data[1]);
    if (score[0] > 9 || score[1] >9){
      System.out.println(-1);
    }else{
      System.out.println(score[0] * score[1]);
    }
  }
}