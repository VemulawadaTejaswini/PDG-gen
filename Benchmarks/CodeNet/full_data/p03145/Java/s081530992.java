import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nyu=sc.nextLine().split(" ");
        int A=Integer.parseInt(nyu[0]);
        int B=Integer.parseInt(nyu[1]);
        int C=Integer.parseInt(nyu[2]);
        System.out.println(multi(A,B));
    }
  
  public static int multi(int x, int y){
   return x*y/2; 
  }
}