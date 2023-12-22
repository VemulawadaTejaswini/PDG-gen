import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    if(flagJudge(x) == flagJudge(y)){
      if(flagJudge(x) != 0){
        System.out.println("Yes");
      }
    }else{
      System.out.println("No");
    }
  }
   
  private static int flagJudge(int a){
    int flag = 0;
    if(a == 2){
  	}else if(a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12){
      flag = 1;
    }else{
      flag = 2;
    }
    return flag;
  }
}  
      
      