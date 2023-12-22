import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        StringBuffer n = new StringBuffer(scanner.next());
        for(int i = 0; i < n.length(); i++){
            switch (n.charAt(i)){
                case '1':
                    n.setCharAt(i, '9');
                    break;
                case '9':
                    n.setCharAt(i, '1');
                    break;
            }
        }
        System.out.println(n);
    }
}