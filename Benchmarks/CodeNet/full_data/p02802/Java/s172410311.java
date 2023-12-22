import java.util.*;
 
public class Main {
    public static void main(String[] args){
      
      int cor = 0;
      int pen = 0;
      
      Scanner scan = new Scanner(System.in);
   	  int n = scan.nextInt();
      int m = scan.nextInt();
      
	  Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
      Hashtable<Integer, Boolean> first = new Hashtable<Integer, Boolean>();
      
      int i = 1;
      while(i<=n){
        numbers.put(i, 0);
        first.put(i, false);
        i++;
      }
      
      i = 0;
      while(i!=m){
        Integer p = scan.nextInt();
		Integer tmp = numbers.get(p);
        String s = scan.next();
        if(s.equals("WA")){
            numbers.put(p, tmp+1);
        } else {
            if(first.get(p) == false){
              cor++;
              pen += numbers.get(p);
              first.put(p, true);
            }
        }
        i++;
      }
         
      System.out.println(cor + " " + pen);
      
      return;
 
    }
}
