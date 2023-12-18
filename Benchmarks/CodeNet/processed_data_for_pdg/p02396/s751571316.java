class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp,num = 0;
        while((tmp = sc.nextInt()) != 0) {
          System.out.println("Case " + (++num) + ": " + tmp);
        }
    }
}
