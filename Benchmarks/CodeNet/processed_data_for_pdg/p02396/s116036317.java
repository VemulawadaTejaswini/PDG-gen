public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        for(int i = 1;; i++){
            x = sc.nextInt();
            if(x != 0){
                System.out.printf("Case %d: %d\n", i, x);
            }else{
                break;
            }
        }
    }
}
