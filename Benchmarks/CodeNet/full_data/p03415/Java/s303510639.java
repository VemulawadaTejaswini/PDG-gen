import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = new String[9];
        for(int i = 0;i < 9;i++){
            c[i] = sc.next();
        }
        System.out.println(c[0]+c[4]+c[7]);
    }
}