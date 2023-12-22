import java.util.Scanner;

class Main {
    public static void main (String[] arg) {
        int N, K;
        int counter = 0;
        int endAcounter = 0;
        int startBconter = 0;
        String AB = "AB";
        String A = "A";
        String B = "B";
        String lookStr = "";

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        String[] strs = new String[N];

        for (int i = 0; i < N; i++) {
            lookStr = scanner.next();
            strs[i] = lookStr;
            if (lookStr.contains(AB)) {
                counter++;
            }
            if(lookStr.endsWith(A)) {
                endAcounter++;
            }
            if (lookStr.startsWith(B)) {
                startBconter++;
            }
        }
        scanner.close();

        counter += Math.min(endAcounter, startBconter);

        System.out.println(counter);
    } 
}