public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
        int result = 1;
        for(int i=1;i<=3;i++){
            result = result * str;
        }
        System.out.println(result);
    }
}
