class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int middle;
        if (a != max && a !=min) {
            middle = a;
        } else if (b != max && b !=min) {
            middle = b;
        } else {
            middle = c;
        }
        System.out.println(min + " " + middle + " " + max);
    }
}
