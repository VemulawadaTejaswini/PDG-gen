public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++){
            int a = sc.nextInt();
            if( a == 0){
                break;
            }
            System.out.println("Case " + (i+1) +": " + a);
        }
    }
}
