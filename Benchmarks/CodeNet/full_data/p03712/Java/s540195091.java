import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        for(int i = 0; i<W+2; i++) {
            System.out.print("#");
        }
        System.out.println();
        for(int k = 0; k<H; k++) {
            for(int i = 0; i<3; i++) {
                if(i==0 || i == 2) {
                    System.out.print("#");
                }else {
                    System.out.print(sc.next());
                }
            }
            System.out.println();
	}
        for(int i = 0; i<W+2; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}