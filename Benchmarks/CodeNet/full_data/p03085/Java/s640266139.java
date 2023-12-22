import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String input = sc.next();
      	String answer;
      
        switch(input) {
          case "A":
            answer = "T";
            break;
          case "T":
            answer = "A";
            break;
          case "C":
            answer = "G";
            break;
          case "G":
            answer = "C";
            break;
        }
      
        System.out.print(answer);
    }
}