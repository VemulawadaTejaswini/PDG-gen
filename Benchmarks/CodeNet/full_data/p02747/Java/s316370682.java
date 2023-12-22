import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length(); i++) {
            if (i%2==0) {
                if (arr[i]!='h') {
                    System.out.print("No");
                    return;
                }
            }else {
                if (arr[i]!='i') {
                    System.out.print("No");
                    return;
                }
            }
        }

        if (arr[s.length()-1]=='h') {
            System.out.print("No");
            return;
        }

        System.out.print("Yes");
    }

}

