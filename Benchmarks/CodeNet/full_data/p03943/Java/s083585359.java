import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int A = stdIn.nextInt();
    int B = stdIn.nextInt();
    int C = stdIn.nextInt();
    int max=Math.max(A,Math.max(B,C));
    if(A==B&&B==C){
      System.out.println("No");
    }else{
    if(max==A+B||max==B+C||max==B+C){
    	System.out.println("Yes");
    }else{
    	System.out.println("No");
    }
    }
  }
}
    