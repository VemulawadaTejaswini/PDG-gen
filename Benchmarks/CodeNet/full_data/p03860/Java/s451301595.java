import java.util.*;
class Abc {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      String chaineCaractere = scan.nextLine();

      String[] motChaine = chaineCaractere.split(" ");

      String raccourciChaine = "";

      for (int i = 0; i < motChaine.length; i++){
        raccourciChaine = raccourciChaine + motChaine[i].charAt(0);
      }

      System.out.println(raccourciChaine.toUpperCase());

  }
}
