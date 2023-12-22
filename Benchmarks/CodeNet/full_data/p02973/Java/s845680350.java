import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][2];
        for (int i = 0; i < N; i++) {
            map[i][0] = i;
            map[i][1] = sc.nextInt();
        }
        //dump(map);
        int result = 1;
        int num = -1;
        int kudari_length = 0;
        for(int i=0;i<N;i++){
            if(map[i][1]-num > 0){
                kudari_length = 0;
            }
            else{
                kudari_length++;
            }
            num = map[i][1];
            if(kudari_length>result)result=kudari_length;
        }
        System.out.println(result+1);
    }

    public static void dump(int[][] a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}