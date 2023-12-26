public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[] inputNumbers = new int[n];
        int result = 1;
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(inputNumbers);
        for (int i = 1; i < inputNumbers.length; i++) {
            if (inputNumbers[i] > inputNumbers[i - 1])
                result++;
        }
        System.out.println(result);
    }
}
