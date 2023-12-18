public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        int i = 1;
        while(true){
            x  = sc.nextInt();
            if(x == 0)break;
            System.out.println("Case " + (i++) + ": " + x);
        }
    }
}
