import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] list = new int[N];
        int pos =0; 
        list[0] = 0; 
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        int ptr=0;
        while( pos <= X) {
            pos += list[ptr];
            ptr++;
//            System.out.println("pos:"+pos+" ptr: "+ptr);
        }
        System.out.println(ptr);
    }
}