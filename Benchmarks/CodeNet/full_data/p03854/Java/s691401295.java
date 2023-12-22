import java.util.*;

class Main {

  public static void main(String[] args) {

    String[] motValide = new String[]{"eraser", "erase", "dreamer", "dream"};

    Scanner scan = new Scanner(System.in);
    String chaine = scan.nextLine();

    for(int i = 0; i < motValide.length; i++)
      chaine = chaine.replace(motValide[i], "");

    if (chaine.length() == 0)
      System.out.println("Yes");
    else
      System.out.println("No");

  }

}
