public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] answer = new int[6];
        int x = 0;
        for (int i = 1; i < 1000000000; i++) {
            if (i * i >= S) {
                answer[0] = i;
                answer[1] = i;
                answer[2] = 0;
                answer[3] = i / 2;
                answer[4] = i / 2;
                answer[5] = 0;
                break;
            }
        }
        for (int i = 0; i < 6; i++)
            if (i == 5) {
                System.out.println(answer[i]);
            } else {
                System.out.print(answer[i] + " ");
            }
    }
}