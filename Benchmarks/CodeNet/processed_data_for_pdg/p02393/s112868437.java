public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int x[] = {a,b,c};
        Arrays.sort(x);
        System.out.println(x[0]+" "+x[1]+" "+x[2]);
}
}
