public class Main{
    public static void main(String[] args){
        Scanner Num = new Scanner(System.in);
        int a = Num.nextInt();
        int b = Num.nextInt();
        if(a > b){
            System.out.println("a > b");
        }else if(a < b){
             System.out.println("a < b");
        }else if(a == b){
            System.out.println("a == b");
        }
    }
}
