import java.util.*;
class Main{
  public static void main(String[] args){
    int max = 0;
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.next());
    String str = scan.next();
    for(int i = 0; i < N; i++){
      for(int m = i+1+max; m < N; m++){
        String target = str.substring(i, m+1);
        String other = str.substring(0, i) + str.substring(m+1);
        if(other.contains(target) && max < target.length()){
          max = target.length();
        }
      }
    }
    System.out.println(max);
  }
 }