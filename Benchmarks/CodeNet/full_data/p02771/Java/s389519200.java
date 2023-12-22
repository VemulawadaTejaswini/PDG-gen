import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int m=sc.nextInt();
    System.out.println((n==k||n==m||k==m)?(n==k&&k==m)?"No":"Yes":"No");
  }
}
