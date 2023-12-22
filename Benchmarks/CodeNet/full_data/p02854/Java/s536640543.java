import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    int[] picks = new int[num];
    int total = 0;
    for(int i = 0; i < num; i++){
      picks[i] = Integer.parseInt(sc.next());
      total += picks[i];
    }

    int front = 0;
    int frontcount = 0;
    for(int i = 0; i < num; i++){
      if(front+picks[i] > total/2)
        break;
      else{
        front+=picks[i];
        frontcount++;
      }
    }

    int back = 0;
    int backcount = 0;
    for(int i = num-1; i > 0; i--){
      if(back+picks[i] > total/2)
        break;
      else{
        back+=picks[i];
        backcount++;
      }
    }

    if(frontcount+backcount != num){
      if(front<back)
        front+=picks[frontcount];
      else
        back+=picks[frontcount];
    }

    if(front<back)
      System.out.println(back-front);
    else
      System.out.println(front-back);
  }
}