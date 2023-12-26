public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = s;
        while (result.contains("B")) {
            result = result.replaceAll("[01]B", "");
            result = result.replaceAll("^B", "");
        }
        System.out.println(result);
        sc.close();
    }
}
