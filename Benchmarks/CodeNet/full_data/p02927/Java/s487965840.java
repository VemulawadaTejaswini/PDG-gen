import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Manth = sc.nextInt();
    int Day = sc.nextInt();
    int Ten =0;
    int One =0;
    int count=0;
    for(int i=1;i<=Manth;i++){
      for(int j=22;j<=Day;j++){
       Ten =j/10;
        One =j-(10*Ten);
        if(Ten*One==i){
          count++;
        }
      }
    }if(count>0){
    System.out.println(count-1);
    }else{
      System.out.println(0);
    }
  }
}