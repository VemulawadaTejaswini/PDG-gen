import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> num = new ArrayList<Integer>();
    for(int i=0;i<n;++i){
      num.add(sc.nextInt());
    }
    for(int i=1;i<n;++i){
      System.out.print(num.indexOf(i)+1+ " ");
    }
    System.out.println(num.indexOf(n)+1);
  }
}