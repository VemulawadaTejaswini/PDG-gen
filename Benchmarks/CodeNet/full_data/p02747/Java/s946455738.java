import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != 'h' || arr[i] != 'i'){
                System.out.println("No");
                return;
            }
            if (arr[i] == 'h' && arr[i + 1] != 'i') {
                System.out.println("No");
                return;
            }else if (arr[i] == 'i' && arr[i + 1] != 'h') {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return ;
    }
}
