import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
    int[] order = new int[n];
    String out = "";
    for(int i = 0; i < n; i++){
      order[sc.nextInt()] = i + 1;
      out += "" + order[i] + " ";
    } 
    System.out.println(out);
  }
}