class Main {
    static int a;
    static int b;
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();    
      b = sc.nextInt();    
      System.out.println(a * b + " " + 2*(a + b));
    }
}
