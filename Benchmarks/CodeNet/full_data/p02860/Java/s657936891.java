import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan =new Scanner(System.in);
    int N=scan.nextInt();
    scan.nextLine();
    String str=scan.nextLine();
    if(str.substring(0,N/2).equals(str.substring(N/2))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}