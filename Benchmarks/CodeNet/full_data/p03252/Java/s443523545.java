import java.util.Scanner;
import java.util.Map; 
import java.util.TreeMap; 
import java.util.Arrays;


public class Main {
  public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    String Sreader = reader.nextLine();
    String Treader = reader.nextLine();
    Map<Character, Integer> S = new TreeMap<Character, Integer>();
    Map<Character, Integer> T = new TreeMap<Character, Integer>();
    boolean result = true;
    int Ssize = 0;
    int Tsize = 0;
    
   for (int i = 0; i < Sreader.length(); i++) {
     Character c = Sreader.charAt(i);
     if (S.containsKey(c)) {
     	S.put(c, (S.get(c) + 1));
     } else {
     	S.put(c, 1);
       Ssize++;
     }
   }
    for (int i = 0; i < Treader.length(); i++) {
     Character c = Treader.charAt(i);
     if (T.containsKey(c)) {
     	T.put(c, (T.get(c) + 1));
     } else {
     	T.put(c, 1);
       Tsize++;
     }
   }
   Integer[] Svalues = S.values().toArray(new Integer[Ssize]);
   Integer[] Tvalues = T.values().toArray(new Integer[Tsize]);
   Arrays.sort(Svalues);
   Arrays.sort(Tvalues);
    
    if(Ssize == Tsize) {
    for (int i = 0; i < Ssize;i++) {
    	if (Svalues[i] != Tvalues[i]) {
        	result = false;
        }
    }
    } else {
    	result = false;
    }
    
     if (result) {
     	System.out.print("Yes");
     } else {
     	System.out.print("No");
     }
  }
}