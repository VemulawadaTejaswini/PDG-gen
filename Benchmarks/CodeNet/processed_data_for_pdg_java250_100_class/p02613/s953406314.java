public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ansAC = 0;
        int ansWA = 0;
        int ansTLE = 0;
        int ansRE = 0;
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            String input = scan.next();
            results.add(input);
        }
        ansAC = Collections.frequency(results, "AC");
        ansWA = Collections.frequency(results, "WA");
        ansTLE = Collections.frequency(results, "TLE");
        ansRE = Collections.frequency(results, "RE");
        System.out.println("AC x "+ ansAC);
        System.out.println("WA x "+ ansWA);
        System.out.println("TLE x "+ ansTLE);
        System.out.println("RE x "+ ansRE);
        scan.close();
    }
}
