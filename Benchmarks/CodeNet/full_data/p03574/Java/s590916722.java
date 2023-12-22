import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int H=sc.nextInt(),W=sc.nextInt(),S[][]=new int[H][W];
        for(int i=0;i<H;i++){
            String t=sc.next();
            for(int j=0;j<W;j++){
                if (t.charAt(j)=='#'){
                    S[i][j]=-1;
                }else{
                    S[i][j]=0;
                }
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(S[i][j]==-1){
                    for(int k=-1;k<2;k++){
                        for(int l=-1;l<2;l++){
                            if(k+i>=0&&j+l>=0&&k+i<H&&j+l<W){
                                if(S[i+k][j+l]!=-1) S[i+k][j+l]++;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(S[i][j]==-1){
                    System.out.print("#");
                }else{
                    System.out.print(S[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}