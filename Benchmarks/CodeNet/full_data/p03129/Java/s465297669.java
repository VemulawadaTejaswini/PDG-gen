import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  x,y;
    x = sc.nextInt();
    y = sc.nextInt();
    if(x%2==1){
      if(x+1/2>=y){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
    else if(x==1){
      if(y==1){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
    else if(x==y)
        System.out.println("NO");
    else{
      if(x/2>=y){
        System.out.println("YES");
      }
      else{
         System.out.println("NO");
      }
    }
  }
}
