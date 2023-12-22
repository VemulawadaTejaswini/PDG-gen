import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    if (S.charAt(0) == 'A'){
      int countC = 0;

      for (int i = 2; i < S.length() - 1; i++){
        if (S.charAt(i) == 'C'){
          countC++;
        }
      }

      HashSet<Character> set = new HashSet<>();
      set.add('A');
      set.add('C');

      if (countC == 1){

        for (char c: S.toCharArray()){
          if (Character.isUpperCase(c) && !set.contains(c)){
            System.out.println("WA");
            return;
          }
        }

        System.out.println("AC");
        return;
      }
    }

    System.out.println("WA");
    return;
  }

  static List<Integer> primeList(int n){
    List<Integer> list = new ArrayList<>();
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);
    prime[0] = false;
    prime[1] = false;
    for (int i = 2; i < Math.sqrt(n); i++){
      if (!prime[i]){continue;}
      for (int j = 2; i * j <= n; j++){
        prime[i * j] = false;
      }
    }

    for (int i = 0; i < prime.length; i++){
      if (prime[i]){list.add(i);}
    }

    return list;
  }

}
