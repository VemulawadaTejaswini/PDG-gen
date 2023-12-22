import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=(int)n/4;i<=(int)n*3/4+1;i++){
      for(int j=(int)n/4;j<=(int)n*3/4+1;j++){
        long x = n*i*j;
        long y = 4*i*j-n*(i+j);
        double w = (double)x/y;
        if(w==(int)w&&w>=0){
          System.out.println(i+" "+j+" "+(int)w);
          return;
        }
      }
    }
  }
}