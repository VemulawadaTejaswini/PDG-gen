import java.util.Scanner;

public class Main{
  public static int[] correctGoal;
  public static int[] wrongGoal;
  
  public static void goal(String s, int start){
    if(s.charAt(start) == 'L'){
      correctGoal[start] = wrongGoal[start - 1];
      wrongGoal[start] = correctGoal[start - 1];
    }else if(start > 0 && s.charAt(start - 1) == 'R'){
      correctGoal[start] = wrongGoal[start - 1];
      wrongGoal[start] = correctGoal[start - 1];
    }else{
      int step = 0;
      while(s.charAt(start + step) == 'R'){
        step++;
      }
      if(step % 2 == 0){
        correctGoal[start] = start + step;
        wrongGoal[start] = start + step - 1;
      }else{
        correctGoal[start] = start + step - 1;
        wrongGoal[start] = start + step;
      }
    }
  }
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int n = s.length();
    correctGoal = new int[n];
    wrongGoal = new int[n];
    int[] gathered = new int[n];
    for(int i = 0; i < n; i++){
      gathered[i] = 0;
      goal(s, i);
    }
    for(int i = 0; i < n; i++){
      gathered[correctGoal[i]]++;
    }
    for(int i = 0; i < n - 1; i++){
      System.out.print(gathered[i] + " ");
    }
    System.out.println(gathered[n-1]);  
  }
}
