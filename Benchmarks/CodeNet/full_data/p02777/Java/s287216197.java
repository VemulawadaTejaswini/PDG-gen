import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word1 = sc.next();
    String word2 = sc.next();
    int word1Cnt = sc.nextInt();
    int word2Cnt = sc.nextInt();
    String word3 = sc.next();
    
    if(word1.equals(word3)){
      word1Cnt--;
    }else if(word2.equals(word3)){
      word2Cnt--;
    }else {
    }
    
    System.out.println(word1Cnt +" "+ word2Cnt);
  }
}
