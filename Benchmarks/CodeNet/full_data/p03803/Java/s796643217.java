import java.util.Scanner;

public class Main {

  public static int[] powerCard = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,1};

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] card = s.split(" ");

    int i = Integer.parseInt(card[0]);
    int j = Integer.parseInt(card[1]);
if ((i < 14 && j < 14) && (i > 0 && j > 0) {
    for (int k = 0; k < powerCard.length; k++){
      if (powerCard[k] == i){
        i = k;
      }
      if (powerCard[k] == j){
        j = k;
      }
    }

    if (i > j){
      System.out.println("Alice");
    }
    else if (i < j){
      System.out.println("Bob");
    }
    else{
      System.out.println("Draw");
    }
}else{
System.out.println("Draw");
}
  }
}
