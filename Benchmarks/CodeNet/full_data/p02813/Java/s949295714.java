import java.util.*;
 
public class Main {
    public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
   	  int n = scan.nextInt();
      scan.nextLine();

      ArrayList<Integer> listP = new ArrayList<Integer>();
      ArrayList<Integer> listQ = new ArrayList<Integer>();
      int op=0;
      int oq=0;
      int i = 1;
      while(i<=n){
        listP.add(i);
        listQ.add(i);
        i++;
      }
      
      
      i=1;
      
      while(i<n){
        int p = scan.nextInt();
        int od = listP.indexOf(p) + 1;
        listP.remove(od-1);
        op += (od-1)*fact(n-i);
        i++;
      }
      op++;
      scan.nextLine();
      i=1;
      
      while(i<n){
        int q = scan.nextInt();
        int od = listQ.indexOf(q) + 1;
        listQ.remove(od-1);
        oq += (od-1)*fact(n-i);
        i++;
      }
      oq++;
      
      System.out.println(Math.abs(op-oq));
      
      return;
 
    }
  
  public static int fact(int k){
    if(k<=1){
      return 1;
    } else {
      return k*fact(k-1);
    }
  }
}
