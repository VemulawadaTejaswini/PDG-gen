public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int indexA = s.indexOf("A");
        int indexZ = s.lastIndexOf("Z");
        int result = indexZ - indexA + 1;
        System.out.println(result);
    }
}
