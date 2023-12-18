public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a_integer_value = scanner.nextInt();
        int b_integer_value = scanner.nextInt();
        if (a_integer_value<b_integer_value){
            System.out.println("a < b");
        }else if(a_integer_value>b_integer_value){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
