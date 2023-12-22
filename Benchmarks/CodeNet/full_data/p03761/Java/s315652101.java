import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] map = new int[26];
    int n = sc.nextInt();
    String str = sc.next();
    for(int i = 0; i < str.length(); i++){
      map[str.charAt(i) - 'a']++;
    }

    for(int i = 0; i < n-1; i++){
      map = f(map, sc.next());
    }
    for(int i = 0; i < 26; i++){
      for(int j = 0; j < map[i]; j++){
        System.out.print((char)('a' + i));
      }
    }
    System.out.println();
  }
  
  public static int[] f(int[] map, String str){
    int[] map2 = new int[26];
    for(int i = 0; i < str.length(); i++){
      map2[str.charAt(i) - 'a']++;
    }
    for(int i = 0; i < 26; i++){
      map[i] = Math.min(map[i], map2[i]);
    }
    return map;
  }
}