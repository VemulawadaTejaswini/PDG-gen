import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int untastyAntidote = Integer.parseInt(sc.next());
    int tastyAntidote = Integer.parseInt(sc.next());
    int tastyPoison = Integer.parseInt(sc.next());
    sc.close();

    int health = 1;

        if (tastyPoison == 0) {
                    System.out.println(tastyAntidote);
          health = -1;
                } else if (untastyAntidote == 0 && tastyAntidote == 0 && tastyPoison == 1) {
                    System.out.println(tastyPoison);
          health = -1;
                } else if (tastyAntidote >= tastyPoison) {
                    System.out.println(tastyAntidote + tastyPoison);
          health = -1;
                } else if (untastyAntidote >= tastyPoison) {
                    System.out.println(tastyPoison);
          health = -1;
                } else if (tastyPoison > untastyAntidote) {
                    System.out.println(untastyAntidote + 1);
          			health = -1;
                }

        int tastyEaten = 0;

        while (health >= 0) {

            if (health == 0) {
                if (tastyAntidote > 0) {
                                    tastyAntidote--;
                                    health++;
                                    tastyEaten++;
                                } else if (untastyAntidote > 0) {
                                    untastyAntidote--;
                                    health++;
                                } else {
                                    break;
                                    }
            } else if (health > 0) {
                if (tastyPoison > 0) {
                    tastyPoison--;
                    tastyEaten++;
                    health--;
                } else if (tastyAntidote > 0) {
                    tastyAntidote--;
                    tastyEaten++;
                } else if (tastyAntidote == 0) {
                    break;
                } if (tastyPoison == 0) {
                                      break;
                                  }
            }
        }

    if (health > -1){
        System.out.println(tastyEaten);
    }
  }
}