import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int m, a, r, c, h;
    m = a = r = c = h = 0;
    Set<Character> set = new HashSet<>();
    for(int i = 0; i < N; i++){
      String str = sc.nextLine();
      if(str.charAt(0) == 'M'){
        set.add('M');
        m++;
      }else if(str.charAt(0) == 'A'){
        set.add('A');
        a++;
      }else if(str.charAt(0) == 'R'){
        set.add('R');
        r++;
      }else if(str.charAt(0) == 'C'){
        set.add('C');
        c++;
      }else if(str.charAt(0) == 'H'){
        set.add('H');
        h++;
      }
    }
    
    long ans = 0;
    if(set.size() > 2){
      ans += m * a * r;
      ans += m * a * c;
      ans += m * a * h;
      ans += m * r * c;
      ans += m * r * h;
      ans += m * c * h;
      ans += a * r * c;
      ans += a * r * h;
      ans += a * c * h;
      ans += r * c * h;
    }
    System.out.println(ans);
  }
}