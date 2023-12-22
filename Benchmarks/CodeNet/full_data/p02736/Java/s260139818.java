import java.util.Scanner;
import java.util.HashMap;

public class Main{
  
  public void helpFunc(int N, HashMap<Integer, Integer> hmap){
  	int val;
    for(int i=1; i<N; i++)
    {
      for(int j=0; j < N-i; j++)
      { 
        val = Math.abs(hmap.get(j) - hmap.get(j+1));
        hmap.put(j, val);
      }
    }
    System.out.println(hmap.get(0));
  }
  
  static public void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> hmap = new HashMap<>();
    String s;
    s = sc.next();
    for(int j=0; j<N; j++)
    {
      hmap.put(j, Integer.valueOf(s.charAt(j)) - 48);
    }
    
    Main obj = new Main();
    obj.helpFunc(N, hmap);
  }
}