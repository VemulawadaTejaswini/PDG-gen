import java.util.
  
public class Abc {
public static void main(String[] args){
 System.out.println('レートを入力してください。')
 String score = new Scanner(System.in).nextLine();
 int sukeme_score = Integer.parseInt(score);
 
  if (sukeme_score < 1200 && sukeme_score >= 1){
      System.out.println("ABC");
    } else if (sukeme_score >= 1200 && sukeme_score <= 3000) {
      System.out.println("ARC");
    } else {
      System.out.println("1~3,000で入力してください。");
    }
  }
}