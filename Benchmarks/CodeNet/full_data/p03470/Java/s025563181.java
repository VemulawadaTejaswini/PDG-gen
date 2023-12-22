import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] ary = new int[cnt];
    for(int i = 0; i < cnt; i++){
        ary[i] = sc.nextInt();
    }
    ary = Arrays.stream(ary).distinct().toArray();
    System.out.println(ary.length);
  }
}