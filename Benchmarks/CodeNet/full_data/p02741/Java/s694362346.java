import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int K =sc.nextInt();
    int M[] =new int[32];
    for(int i=0;i<K;i++){
      M[i]=sc.nextInt();}
    System.out.println(M[K]);
  }
}