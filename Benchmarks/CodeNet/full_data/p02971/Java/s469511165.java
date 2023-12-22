import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
       
      ArrayList <Integer> a = new ArrayList <Integer>();
 
      for(int i=0; i<N; i++){
         int n = scanner.nextInt();
      	 a.add(n);
       
        
      }Collections.sort(a);
  		for(int i=0; i<N; i++){
          ArrayList<Integer> b = (ArrayList<Integer>) a.clone();
         b.remove(i);

      System.out.println(b.get(b.size()-1));
        }
      
}
}