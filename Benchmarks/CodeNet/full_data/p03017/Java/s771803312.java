import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String str = sc.next();

        if(str.substring(A).contains("##")) System.out.println("No");
        else if(C>D) {
            String line = str.substring(B-1,D+2);
            if(line.contains("...")) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }else {
            System.out.println("Yes");
        }

    }
}