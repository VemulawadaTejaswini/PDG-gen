public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int resultAC = 0;
    int resultWA = 0;
    int resultTLE = 0;
    int resultRE = 0;
    for(int i=0; i<num+1; i++){
        String inputStr = scan.nextLine();
        switch (inputStr) {
            case "AC":
              resultAC += 1;
              continue;
            case "WA":
              resultWA += 1;
              continue;
            case "TLE":
              resultTLE += 1;
              continue;
            case "RE":
              resultRE += 1;
              continue;
            default:
              break;
        }
    }
    System.out.println("AC x " + resultAC);
    System.out.println("WA x " + resultWA);
    System.out.println("TLE x " + resultTLE);
    System.out.println("RE x " + resultRE);
  }
}
