

import java.util.Scanner;

public class Main {

    static long[][] aa;
    static long maxx(String[] grid,int x,int y,int h,int w){

            if(x>=h || y>=w ){
                return 0;
            }
            if( grid[x].charAt(y)=='#' ){
                return 0;
            }
            if(x==h-1 && y==w-1 ){
                return 1;
            }
            if(aa[x][y]!=-1){
                return aa[x][y];
            }

            return aa[x][y]=(long)(maxx(grid,x+1,y,h,w)+maxx(grid,x,y+1,h,w))%(long)(Math.pow(10,9)+7);

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h=scanner.nextInt();
        int w=scanner.nextInt();
        String[] grid=new String[h];
        for(int j=0;j<h;j++){
            grid[j]=scanner.next();
        }
        aa=new long[h][w];
        for(int j=0;j<h;j++){
            for(int i=0;i<w;i++){
                aa[j][i]=-1;
            }
        }
        System.out.println(maxx(grid,0,0,h,w));


    }


}
