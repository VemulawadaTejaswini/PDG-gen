import java.util.*
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int num = sc.nextInt();
        System.out.println((amount % 500) <= num);
    }
}