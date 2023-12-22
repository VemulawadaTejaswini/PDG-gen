import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int  n = sc.nextInt();
   List<Integer> a = new ArrayList<>();
   for(int i = 0;i < n;i++){
       a.add(sc.nextInt());
   }
   int max = a.get(0);
   int min = a.get(0);
   for(int i = 1; i < n ; i++){
     if(a.get(i) > max){
       max = a.get(i);
     }
     if(a.get(i) < min){
       min = a.get(i);
     }
   }
   System.out.println(max - min);
 }

}
