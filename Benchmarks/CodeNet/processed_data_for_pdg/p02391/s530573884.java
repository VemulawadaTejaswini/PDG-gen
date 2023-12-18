class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        if(a<b) System.out.println("a < b");
        else if(a>b) System.out.println("a > b");
        else System.out.println("a == b");
    }
}
