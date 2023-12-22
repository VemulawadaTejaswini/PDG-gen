import java.util.*;

class Main {
  public static long ketasu(long x){
    long ans = 1;
    while (x > 9){
     x /= 10;
     ans++;
    }
    return(ans);
  }
  
  public static boolean judge(long y){
    long tempa = y % 10;
    long tempb = 0;
    y /= 10;
    while (y > 0){
      tempb = y % 10;
      y = y/10;
      if (Math.abs(tempa-tempb) > 1){
        return false;
      }
      tempa = tempb;
    }
    return true;
  }
      
  
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long x = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    int ans = 0;
    int i =1;
    int count = 0;
    while (count < x){
      if (judge(i)){
        ans = i;
        count++;
      }
      i++;
    }
    System.out.println(ans);
  }
}
