public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(true){
            int x = scan.nextInt();
            if(x == 0)break;
            System.out.println("Case " + i++ + ": " + x);
        }
        scan.close();
    }
}
