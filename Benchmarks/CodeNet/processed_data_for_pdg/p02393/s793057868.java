class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] num_arr = { 0, 0, 0 };
            for (int i = 0; i < num_arr.length; i++) {
                num_arr[i] = sc.nextInt();
            }
            for (int i = 0; i < num_arr.length - 1; i++) {
                for (int j = num_arr.length -1 ; j > i; j--) {
                    if (num_arr[j] < num_arr[j - 1]) {
                        int buf = num_arr[j];
                        num_arr[j] = num_arr[j - 1];
                        num_arr[j - 1] = buf;
                    }
                }
            }
            System.out.println(num_arr[0] + " " + num_arr[1] + " " + num_arr[2]);
        }
    }
}
