public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
