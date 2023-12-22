import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<String> saidList = new ArrayList<>();
    String ans = "Yes";
    saidList.add(sc.next());
    for (int i = 1; i < N; i++) {
      String currentWord = sc.next();
      if (saidList.contains(currentWord) || !isShiritori(currentWord, saidList.get(i-1))) {
        ans = "No";
        break;
      }
      saidList.add(currentWord);
    }
    System.out.println(ans);
  }
  private static boolean isShiritori(String curWord, String preWord) {
     return curWord.substring(0,1).equals(preWord.substring(preWord.length()-1));
  }
}