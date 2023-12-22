public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;

        System.out.println("input 1st integer");
        int a = sc.nextInt();
        System.out.println("input 2nd integer");
        int b = sc.nextInt();
        System.out.println("input 3rd integer");
        int c = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        temp = a;
        a = c;
        c = temp;

        System.out.println(a + " " + b + " " + c);
    }