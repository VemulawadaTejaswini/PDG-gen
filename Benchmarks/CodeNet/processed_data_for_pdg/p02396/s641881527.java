public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,tmp = 1;
        while((x = scan.nextInt()) != 0){
            System.out.println("Case " + tmp + ": " + x);
            tmp++;
        }
    }
}
