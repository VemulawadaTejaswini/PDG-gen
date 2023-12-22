import java.util.*;
import java.io.*;
public class Main {
 public static void main(String[] args) throws Exception {
   Scanner file = new Scanner(System.in);
   int n = file.nextInt();
   HashMap<ArrayList<Character>, Integer> hm = new HashMap<>();
   long t = 0;
   for (int i = 0; i < n; i++) {
     String s = file.next();
     ArrayList<Character> a = new ArrayList<>();
     for (char c : s.toCharArray()) a.add(c);
     Collections.sort(a);
     if (!hm.containsKey(a)) hm.put(a, 0);
     t += hm.get(a);
     hm.put(a, hm.get(a) + 1);
   }
   System.out.println(t);
 }
}
