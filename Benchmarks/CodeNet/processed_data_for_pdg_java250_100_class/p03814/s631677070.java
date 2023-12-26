public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        int start = s.indexOf("A");
        int end = s.lastIndexOf("Z");
        System.out.println(end - start + 1);
    }
}
