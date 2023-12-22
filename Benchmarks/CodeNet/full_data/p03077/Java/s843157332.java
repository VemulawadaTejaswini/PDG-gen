import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n=sc.nextLong();
    ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=0;i<5;i++){
      a.add(new Integer(sc.nextInt()));
    }
    int min=Collections.min(a);
    System.out.print(n/min+5);
  }
}