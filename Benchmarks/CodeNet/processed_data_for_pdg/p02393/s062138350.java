public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = 3;
        int v[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            v[i] = scan.nextInt();
        }
        Arrays.sort(v);
        for (int i = 0; i < n-1; i++)
        {
            System.out.print(v[i] + " ");
        }
        System.out.println(v[n-1]);
    }
}
