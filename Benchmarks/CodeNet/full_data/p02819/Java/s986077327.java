import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int y=x;
    if(x==2){
      System.out.println(x);
    }else {
      while(true){
        boolean ok=true;
        for(int i=2;i<y;i++){
          if(y%i==0){
            ok=false;
            break;
          }
        }
        if(ok){
          break;
        }
        y++;
      }
      System.out.println(y);
    }
  }
}