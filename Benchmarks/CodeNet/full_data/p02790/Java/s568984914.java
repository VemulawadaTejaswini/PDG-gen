import java.util.*;
public class Main {
  
  private static void roop(int a, int b){
    for(int i = 0; i < a; i++){
      System.out.print(b);
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    //char[] a = sc.nextLine().toCharArray();
    if(a < b){
      roop(b,a);
    }
    else
    {
      roop(a,b);
    }
  }
}