import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  Set<Integer> s = new HashSet<>();
  for (int i=0; i<N; i++) {
    int di = sc.nextInt();
    s.add(di);
  }
  System.out.println(s.size());
}}
