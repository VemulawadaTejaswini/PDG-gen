import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    scanner.close();

    char judge_1 = input.charAt(0);
    char judge_2 = input.charAt(1);

    if(judge_1 == judge_2){
      System.out.println("1 2");
    }else{
      for(int i=2; i<input.length(); i++){
        if(judge_1 == input.charAt(i)){
          System.out.println(Integer.toString(i-1) + " " + Integer.toString(i+1));
          break;
        }
        if(judge_2 == input.charAt(i)){
          System.out.println(Integer.toString(i) + " " + Integer.toString(i+1));
          break;
        }
        if(i == input.length()-1){
          System.out.println("-1 -1");
        }
        judge_1 = judge_2;
        judge_2 = input.charAt(i);
      }
    }
  }
}
