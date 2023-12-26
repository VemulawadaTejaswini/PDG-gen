public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int fivehunds = s.nextInt();
        int hunds = s.nextInt();
        int fifth = s.nextInt();
        int sum = s.nextInt();
        int count = 0;
        for (int i = 0; i <= fifth; i++) {
            for (int j = 0; j <= hunds; j++) {
                for (int k = 0; k <= fivehunds; k++) {
                    int temp = i * 50 + j * 100 + k * 500;
                    if (sum == temp) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
