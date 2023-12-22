public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math[];
        int temp = 0;
        int tempo = 0;
        int j = 0;
        math = new int[4];
        int n = sc.nextInt();
        math[0] = n / 1000;
        n = n % 1000;
        math[1] = n / 100; //3の表示
        n = n % 100; //iに１００で割った余りを代入 i = 21
        math[2] = n / 10; //２の表示
        n = n % 10; //iに１０で割った余りを代入 
        math[3] = 1; //1の表示

        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                temp = math[0];
                continue;
            }
            if (temp == math[i]) {
                j++;
            } else {
                temp = math[i];
            }
        }

        if (j >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}