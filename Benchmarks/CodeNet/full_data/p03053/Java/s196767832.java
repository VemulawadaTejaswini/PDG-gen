import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] m = new char[H][W];

        int bcount= 0;
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                m[i][j] = s.charAt(j);
                if(m[i][j]=='#') bcount++;
            }
        }
        int total = H*W;

        int ope=0;
        while(bcount<total){

            for (int i = 0; i < H ; i++) {
                for (int j = 0; j < W ; j++) {
                    if(m[i][j]=='.'){
                        if(neighborBlack(i,j,m)){
                            m[i][j]='*';
                        }
                    }
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if(m[i][j]=='*'){
                        m[i][j]='#';
                        bcount++;
                    }
                }

            }
            ope++;
        }
        System.out.println(ope);
    }

    private static boolean neighborBlack(int i, int j , char[][] m){
        if(i-1 >= 0 && m[i-1][j] =='#') return true;
        if(j-1 >= 0 && m[i][j-1] =='#') return true;
        if(j+1 < m[0].length && m[i][j+1] =='#') return true;
        if(i+1 < m.length && m[i+1][j] =='#') return true;

        return  false;
    }



}
