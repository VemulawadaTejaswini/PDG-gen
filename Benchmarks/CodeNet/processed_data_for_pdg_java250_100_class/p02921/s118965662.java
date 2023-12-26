public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] c1 = str1.toCharArray();
        String str2 = sc.next();
        char[] c2 = str2.toCharArray();
        int count = 0;
        int n = c1.length;
        for (int i = 0; i < n; i++) {
            if (c1[i] == c2[i]) count++;
        }
        System.out.println(count);
    }
}
