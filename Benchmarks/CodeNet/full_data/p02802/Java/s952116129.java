import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    HashSet<Integer> rightAnswer = new HashSet<Integer>();
    List<Integer> wrongAnswers = new ArrayList<Integer>();
    for (int i=0; i<n; i++) {
      wrongAnswers.add(0);
    }
    int right = 0;

    int wrongs = 0;
    
    for (int i=0; i<m; i++) {
      int p = sc.nextInt();
      String answer = sc.next();
     
      if (rightAnswer.contains(p)) {
        continue;
      }
      if (answer.equals("WA")) {
        int wrongNum = wrongAnswers.get(p-1);
        wrongNum++;
        wrongAnswers.set(p-1, wrongNum);
      }
      else {
        rightAnswer.add(p);
      }
    }
    
    for (int answer: rightAnswer) {
      wrongs += wrongAnswers.get(answer-1);
    }

    System.out.println(rightAnswer.size() + " " + String.valueOf(wrongs));
  }
}