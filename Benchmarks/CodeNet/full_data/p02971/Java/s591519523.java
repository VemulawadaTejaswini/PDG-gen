import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
    }
    for(int x = 0;x < b.length;x++){
      int max = 0;      
      for(int y = 0;y < b.length;y++){
        if(x != y && max < b[y]){
         max = b[y];
        }
      }
      System.out.println(max);
    }
  }
}