import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
    String param  = scan.nextLine();
    String[] info = param.split(" ");

    int nbTown      = Integer.parseInt(info[0]);
    int walkFatigue = Integer.parseInt(info[1]);
    int teleFatigue = Integer.parseInt(info[2]);

    String townInfo = scan.nextLine();
    String[] town = townInfo.split(" ");

    int fatigue = 0;

    for (int i = 1; i < nbTown; i++){

      int v = Integer.parseInt(town[i]) - Integer.parseInt(town[i-1]);

      if (walkFatigue * v < teleFatigue){
        fatigue += walkFatigue * v;
      }
      else{
        fatigue += teleFatigue;
      }
    }

    System.out.println(fatigue);

  }
}
