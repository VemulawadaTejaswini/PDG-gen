public class Main {
    public static int a[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        Arrays.sort(a);
        System.out.printf("%d %d %d\n",a[0],a[1],a[2]);
        sc.close();
    }
}
