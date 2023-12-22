import java.util.*;
  public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int d=sc.nextInt();
    sc.close();
    int d10=d/10;
    int d1=d%10;
    int cnt=0;
    if(d10>=2&&m>=4){
      for(int i=4;i<=m;i++){
        for(int j=2;j<d10;j++){//10の位で，d10未満分
          for(int k=2;k<10;k++){
            if(i==j*k){
              cnt++;
            }
          }
        }
        for(int k=2;k<=d1;k++){//１０の位がd10のとき
          if(i==d10*k){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}