import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int a=sc.nextInt();
    for(int i=1;i<N;i++){
      int Min=1001;
      int Max=-1;
      if(Min>a)Min=a;
      if(Max<a)Max=a;
    System.out.println(Max-Min);}
} 
}
