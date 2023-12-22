
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int count=0;
        for(int i=0;i<3;i++){
            if(s.charAt(i)==t.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}
