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