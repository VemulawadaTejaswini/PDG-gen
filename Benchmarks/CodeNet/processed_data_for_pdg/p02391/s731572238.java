public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        int integer1 = scanner.nextInt();
        if (integer < integer1){
            System.out.println("a < b");
            } else if(integer > integer1){
                System.out.println("a > b");
            }else{
                System.out.println("a == b");
            }
    }
}
