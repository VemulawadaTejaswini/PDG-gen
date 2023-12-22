import java.util.*;

class Main{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String[] S = new String[a];
    for(int i=0;i<a;i++)S[i] = sc.next();
    Arrays.sort(S);
    for(String str : S)System.out.println(str);
    System.out.println();
    }
}
