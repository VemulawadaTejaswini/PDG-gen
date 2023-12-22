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
        int c=1;
        for(int i=0; i<list.length; i++) {
            pos += list[i];
            if(pos > X) {
                break;
            } else if( pos == X) {
                c++;
                break;
            }
            c++;
//            System.out.println("pos:"+pos+" ptr: "+ptr);
        }
        System.out.println(c);
    }
}