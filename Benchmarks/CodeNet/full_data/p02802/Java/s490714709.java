import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        boolean[] done = new boolean[n];
        int ac = 0, penalty = 0;
        int[] wa = new int[n];
        for(int i = 0; i < m; i++) {
            line = sc.nextLine().split(" ");
            int p = Integer.parseInt(line[0]);
            if(done[p-1]) continue;
            if(line[1].equals("AC")) {
                ac++;
                done[p-1] = true;
                penalty+=wa[p-1];
            } else if(line[1].equals("WA")) {
                wa[p-1]++;
            }
        }
        System.out.println(ac + " " + penalty);
    }
}