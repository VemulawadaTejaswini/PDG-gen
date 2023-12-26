public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        int num = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1)));
        String result;
        if (num == 3) {
            result = "bon";
        } else if (num == 0 || num == 1 || num == 6 || num == 8) {
            result = "pon";
        } else {
            result = "hon";
        }
        System.out.println(result);
    }
}
