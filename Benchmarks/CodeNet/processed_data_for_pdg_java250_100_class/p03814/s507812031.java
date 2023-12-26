public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.indexOf("A");
        int z = s.lastIndexOf("Z");
        String str = s.substring(a, z + 1);
        sc.close();
        System.out.println(str.length());
    }
}
