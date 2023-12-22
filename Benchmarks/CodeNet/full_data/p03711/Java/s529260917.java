import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int xg =group(x);
    int yg =group(y);
    if(xg==yg){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }


  }
  
  static int group(int t){
    if(t==1||t==3||t==5||t==7||t==8||t==10||t==12){
      return 1;
    }else if(t==2){
      return 3;
    }else{
      return 2;
    }
  }
  

  
}
