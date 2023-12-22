import java.util.*;
 
public class Main {
    public static void main(String[] args){
      
      int cor = 0;
      int pen = 0;
      
      Scanner scan = new Scanner(System.in);
   	  int n = scan.nextInt();
      int m = scan.nextInt();
      
 	  Hashtable<Integer, Boolean> numbers = new Hashtable<Integer, Boolean>();
      int i = 1;
      while(i<=n){
        numbers.put(i, false);
        i++;
      }
      i=0;
      while(i!=m){
        Integer p = scan.nextInt();
	    Boolean tmp = numbers.get(p);
        String s = scan.next();
        if(tmp == false){
          if(s.equals("WA")){
            pen++;
          } else {
            cor++;
            numbers.put(p, true);
          }
        }
        i++;
      }
         
      System.out.println(cor + " " + pen);
      
      return;
 
    }
}
