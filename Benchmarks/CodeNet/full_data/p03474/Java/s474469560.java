import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String code = sc.nextLine();
        boolean result = false;
        

        if(a >= 1 && b <= 5){
            if(code.length()  == Math.abs(a + b + 1)) {
                for(int i = 0; i < code.length(); i++){
                    char token = code.charAt(i);
                    System.out.println(token);
                    if(i == a   && token == '-') {
                        result = true;
                    } else if (i != a  && token == '-') {
                        result = false;
                    }
                }
            }
        }

        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
