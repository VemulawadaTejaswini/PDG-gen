import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.nextLine();
            System.out.println(a);
            System.out.println(s);

        if(a >= 3200){
            System.out.println(s);
        } else {
            System.out.println("red");
        }
    }
}