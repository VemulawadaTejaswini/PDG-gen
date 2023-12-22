import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] l = new int[M+1];
        int[] r = new int[M+1];
        l[0] = Integer.parseInt(sc.next());
        r[0]= Integer.parseInt(sc.next());
        int max = r[0];
        int min = l[0];
        for(int i = 1; i < M; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
            if(l[i] > min) {
                min = l[i];
            }
            if(r[i] < max) {
                max = r[i];
            }
            if(max - min < 0) {
                max = -1;
                min = 0;
                break;
            }
        }
        
        System.out.println(max - min + 1);
    }
}