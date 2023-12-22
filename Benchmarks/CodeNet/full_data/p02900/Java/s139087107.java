import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long max = (long)Math.sqrt((long)Math.max(A,B))+1L;
    long c = 2;
    ArrayList<Long> prime = new ArrayList<>();
    while(c<=max){
      boolean b = true;
      for(int i=0;i<prime.size();i++){
        b = b && c%prime.get(i)!=0;
      }
      if(b){prime.add(c);}
      c++;
    }
    int ans = 0;
    for(int i=0;i<prime.size();i++){
      if(A%prime.get(i)==0&&B%prime.get(i)==0){
        ans++;
      }
    }
    System.out.println(ans+1);
  }
}
    