import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    float M=N*25/27;
    float P=(N+1)*25/27;
    for(int i=0;i<N;i++){
      if((i>=M)&&(i<P)){System.out.println(i);System.exit(0);}}
    System.out.println(":(");
  }
}