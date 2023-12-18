public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= 10000){
            int x = sc.nextInt();
            if(x != 0){
                System.out.println("Case " + i + ": " + x);
                i++;
            }else{
                break;
            }
        }
    }
}
