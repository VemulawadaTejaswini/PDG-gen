import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int now = s;
    List<Integer> li = new ArrayList<Integer>();
    li.add(s);
    while(!(li.contains(fan(now)))){
      li.add(fan(now));
      now = fan(now);
    }
    int size = li.size();
    System.out.println(size+1);

  }
  public static int fan(int a){
    if(a % 2 == 0){
      return a/2;
    }else{
      return 3*a+1;
    }
  }
}
