import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int untastyAntidote = Integer.parseInt(sc.next());
    int tastyAntidote = Integer.parseInt(sc.next());
    int tastyPoison = Integer.parseInt(sc.next());
    sc.close();
    
    int health = 1;

        if (tastyAntidote == 0 && tastyPoison == 0) {
            System.out.println(0);
        } else if (untastyAntidote == 0 && tastyAntidote == 0 && tastyPoison == 1) {
            System.out.println(1);
        }

        int tastyEaten = 0;

        while (health >= 0) {

            if (health == 0) {
                if (untastyAntidote > 0) {
                    untastyAntidote--;
                    health++;
                } else if (tastyAntidote > 0) {
                    tastyAntidote--;
                    tastyEaten++;
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
                }
            }
        }

        System.out.println(tastyEaten);
  }
}