public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10000; i++){
            int n = sc.nextInt();
            if(n==0)    break;
            System.out.println("Case " + i + ": " + n);
        }
    }
}
