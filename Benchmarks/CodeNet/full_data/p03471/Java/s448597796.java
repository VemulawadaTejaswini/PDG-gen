import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();
        int z;

        for(int x=0;x<=N;x++) {
            for(int y=0;y<=N;y++) {
                z = N - x - y;
                if(Y == x*10000 + y*5000 + z*1000 && 0 <= z && z <= N) {
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}