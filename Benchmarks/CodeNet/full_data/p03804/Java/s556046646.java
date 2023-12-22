import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);

    String[] param = ((scan.nextLine()).split(" "));

    int a = Integer.parseInt(param[0]);
    int b = Integer.parseInt(param[1]);

    String[] imageA = new String[a];

    for (int i = 0; i < a; i++){
      imageA[i] = scan.nextLine();
    }

    String[] imageB = new String[b];

    for (int i = 0; i < b; i++){
      imageB[i] = scan.nextLine();
    }


    boolean containe = containeTab(imageA, imageB);

    if (containe){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

  }

  public static boolean containeTab(String[] imageA, String[] imageB){

    boolean containe = true;

    for (int i = 0; i < imageB.length && containe; i++){
      for (int j = 0; j < imageA.length && containe; j++){

        containe = containeString(imageA[j], imageB[i]);

      }
    }
    return containe;
  }

  public static boolean containeString(String a, String b){

    boolean containe = false;
    boolean all;
    for (int i = 0; i < a.length() && !containe; i++){
      all = true;
      for(int j = 0; j < b.length() && !containe; j++){
        if (a.charAt(i+j) != b.charAt(j)){
          all = false;
        }
      }
      if (all){
        containe = true;
      }
    }
    return containe;
  }
}
