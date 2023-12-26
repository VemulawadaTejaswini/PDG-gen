public class Main {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] arr = new int[26];
        for (int i = 0; i < 4; i++) {
            arr[str.charAt(i) - 'A']++;
        }
        int type = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0 && arr[i] == 2) {
                type++;
            }
        }
        System.out.println(type == 2 ? "Yes" : "No");
    }
}
