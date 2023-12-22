import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();

        int aa=Integer.valueOf(a);
        int bb=Integer.valueOf(b);
        if(aa<bb) {
            for(int x=0;x<bb;x++) {
                System.out.print(aa);
            }
        } else {
            for(int y=0;y<aa;y++) {
                System.out.print(bb);
            }
        }
        
    }
}