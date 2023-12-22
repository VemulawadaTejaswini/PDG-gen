import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    double odd=0;
    for(int i=1;i<=N;i++){
      if(!(i%2==0)){
        odd++;
      }
    }
    System.out.println(String.format("%f",(double)odd/N));
  }
}