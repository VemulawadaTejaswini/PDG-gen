public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        int[] a = new int[x];
        for(int i=0; i < x; i++) {
            a[Integer.parseInt(scanner.next()) - 1] = i;
        }
        for(int i = 0; i < x; i++) {
            System.out.println(a[i]+1);
        }
    }
}
