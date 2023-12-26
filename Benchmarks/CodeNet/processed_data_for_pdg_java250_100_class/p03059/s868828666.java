public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int biscuit = 0;
        for(int i = 1; i < t + 0.5; i++){
            if(i % a == 0){
                biscuit += b;
            }
        }
        System.out.println(biscuit);
    }
}
