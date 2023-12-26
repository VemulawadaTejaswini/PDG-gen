public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        sc.close();
        int result = 0;
        for (String num : s) {
            result += Integer.parseInt(num);
        }
        System.out.println(result);
    }
}
