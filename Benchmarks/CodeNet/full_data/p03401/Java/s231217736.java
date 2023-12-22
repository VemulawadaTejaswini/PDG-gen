import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int n,i=0;

      n = Integer.parseInt(scan.next());

      ArrayList<Integer> a = new ArrayList<Integer>(), b = new ArrayList<Integer>();

      while(i<n){
        a.add(Integer.parseInt(scan.next()));
        i = ++i;
      }

      i = 0;

      while(i<n){
        b = a;
        b.remove(i);
        Collections.sort(b);
        if(b.get(n-2)>=0){
          if(b.get(0)>=0){
            System.out.println(b.get(n-2)*2);
          }else{
            System.out.println((b.get(n-2)-b.get(0))*2);
          }
        }else{
          if(b.get(0)>=0){
            System.out.println((b.get(0)-b.get(n-2))*2);
          }else{
            System.out.println(-(b.get(0)));
          }
        }
        i = ++i;
      }

    }
    catch (Exception e) {

    }
  }
}
