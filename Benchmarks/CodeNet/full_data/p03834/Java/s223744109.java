import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(",");
        for(int i=0; i<array.length; i++) {
            if(i==(array.length-1)) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+" ");
            }
        }
    }
}
