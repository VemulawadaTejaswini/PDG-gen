import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  long N = sc.nextLong();
  Set<Long> s = new HashSet<Long>();
  for(long i = 0;i < N;i++){
    long temp = sc.nextLong();
    if(s.contains(temp))s.remove(temp);
    else s.add(temp);
  }
  System.out.println(s.size());
}}