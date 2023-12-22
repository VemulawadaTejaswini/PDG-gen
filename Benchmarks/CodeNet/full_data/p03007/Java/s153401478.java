import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    String lf = System.lineSeparator();
    String ans = "";
    
    int n = stdIn.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int i = 0; i < n; i++){
      a.add(stdIn.nextInt());
    }
    
    int max;
    int min;
        while(a.size() != 1){
          Collections.sort(a);
          max = a.get(a.size()-1);
          min = a.get(0);
          ans += min + " " + max + lf;
          a.remove(a.size()-1);
          a.remove(0);
          a.add(min - max);
          Collections.sort(a);
          max = a.get(a.size()-1);
          min = a.get(0);
          ans += max + " " + min + lf;
          a.remove(a.size()-1);
          a.remove(0);
          a.add(max - min);
        }
        System.out.println(a.get(0));
    System.out.print(ans);
  }
}
