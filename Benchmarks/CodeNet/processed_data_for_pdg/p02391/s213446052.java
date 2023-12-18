public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        if(val1 < val2){
            System.out.println("a < b");
        }else if(val1 > val2){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
