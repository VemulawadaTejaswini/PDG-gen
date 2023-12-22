import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();

        if (s.contains("##")){
            System.out.println("No");
        }else if ((b<c && c<d) || (c<b && b<d)){
            System.out.println("Yes");
        }else if (b<d && d<c){
            if (s.substring(b-2, d+1).contains("...")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


    }

}

