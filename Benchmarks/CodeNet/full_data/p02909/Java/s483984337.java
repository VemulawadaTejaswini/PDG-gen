import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    String S = sc.next();
    String answer;
    if(S.equals("Sunny")){
      answer = "Cloudy";
    }else if(S.equals("Cloudy")){
    answer = "Rainy";
    }else{
      answer = "Cloudy";
    }
    System.out.println(answer);
  }
}