public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a-b;
            if(c<0){
                System.out.println("a < b");
            }else if(c>0){
                System.out.println("a > b");
            }else{
                System.out.println("a == b");
            }
        }
    }
}
