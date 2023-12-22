import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int xx = Integer.MIN_VALUE;//最小値
    int yy = Integer.MAX_VALUE;//最大値
    int num;
    for(int i=0; i<n; i++){
      num = sc.nextInt();
      if(num>xx){
        xx = num;
      }
    }

    for(int i=0; i<m; i++){
      num = sc.nextInt();
      if(num<yy){
        yy = num;
      }
    }

    //判定
    if(xx>=yy){
      System.out.println("War");//war
    }else{
      if(x<yy&&y>xx){
        System.out.println("No War");//No war
      }else{
        System.out.println("War");//war
      }
    }
  }
}