import java.util.*;

class Main{

  static boolean check_rgb(int r,int g,int b){
    int rgb = r*100 + g*10 + b;
    return rgb % 4 == 0;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();

    if(check_rgb(r,g,b)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}