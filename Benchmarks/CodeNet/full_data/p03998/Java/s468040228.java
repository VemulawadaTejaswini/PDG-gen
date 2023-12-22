import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alice = sc.next();
        String bob = sc.next();
        String charlie = sc.next();
        int a, b, c;
        a = b = c = 0;
        int turn = 1;
        while(true){
            if(turn == 1){
                if(a == alice.length()){
                    System.out.println('A');
                    break;
                }else{
                    if(alice.charAt(a) == 'a')
                        turn = 1;
                    else if(alice.charAt(a) == 'b')
                        turn = 2;
                    else
                        turn = 3;
                    a += 1;
                }
            }else if(turn == 2){
                if(b == bob.length()){
                    System.out.println('B');
                    break;
                }else{
                    if(bob.charAt(b) == 'a')
                        turn = 1;
                    else if(bob.charAt(b) == 'b')
                        turn = 2;
                    else
                        turn = 3;
                    b += 1;
                }
            }else{
                if(c == charlie.length()){
                    System.out.println('C');
                    break;
                }else{
                    if(charlie.charAt(c) == 'a')
                        turn = 1;
                    else if(charlie.charAt(c) == 'b')
                        turn = 2;
                    else
                        turn = 3;
                    c += 1;
                }
            }
        }
    }
}
