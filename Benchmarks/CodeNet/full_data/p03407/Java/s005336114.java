 public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if( C <= (A+B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }