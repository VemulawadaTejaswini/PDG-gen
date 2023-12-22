 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math[];
        int temp = 0;
        int tempo = 0;
        int j = 0;
        math = new int[4];
        for (int i = 0; i <= 3; i++) {
            math[i] = sc.nextInt();
            if (i == 0) {
                temp = math[0];
                continue;
            }
            if (i == 1) {
                tempo = math[1];
                if (temp == tempo) {
                    j++;
                }
                continue;
            }
            if (temp == math[i] || tempo == math[i]) {
                j++;
            }
        }

        if (j >= 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}