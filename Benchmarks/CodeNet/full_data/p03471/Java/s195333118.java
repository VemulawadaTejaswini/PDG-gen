
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        if (y >= n * 1000 && y <= n * 10000) {
            int m10000Max = y / 10000;
            for (int t10000 = m10000Max; t10000 >= 0; t10000--) {
                int temp = y - t10000 * 10000;
                for (int t1000 = temp % 5000 / 1000; t1000 <= temp / 1000; t1000 += 5)
                    if (t10000 + t1000 + (y - (t10000 * 10000 + t1000 * 1000)) / 5000 == n) {
                        System.out.println(t10000 + " " + ((y - (t10000 * 10000 + t1000 * 1000)) / 5000) + " " + t1000);
                        return;
                    }
            }
        }
        System.out.println("-1 -1 -1");
    }