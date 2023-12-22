import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    int saitan;
  	System.out.print("時間Pを入力してください：");
  	Scanner roadp = Scanner.nextInt();
    System.out.print("時間Qを入力してください：");
  	Scanner roadq = Scanner.nextInt();
  	System.out.print("時間Rを入力してください：");
    Scanner roadr = Scanner.nextInt();
    
    if (roadp > roadq) {
      saitan += roadq;
      	if (roadp > roadr) {
          saitan += roadr;
        }
    } else if (roadq > roadp) {
      saitan += roadp;
      	if (roadq > roadr) {
          saitan += roadr;
        } else if (roadr > roadp) {
          saitan += roadp;
          	if (roadr > roadq) {
              saitan += roadq;
            }
        }
    
    System.out.println("最短時間は" + saitan + "です");
    
    
  }
}