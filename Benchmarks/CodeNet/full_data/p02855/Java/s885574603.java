import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int k = scan.nextInt();
        char[][] cake = new char[h][w];
        int[][] cakeans = new int[h][w];
        for(int i=0;i<h;i++){
            String a = scan.next();
            cake[i]=a.toCharArray();
        }
        int num = 1;
        for(int i=0;i<h;i++){
            for(int l=0;l<w;l++){
                if(cake[i][l]=='#'){
                    cakeans[i][l]=num;
                    int p = i;//tate
                    while(true){
                        p-=1;
                        if(p==-1){p=0;break;}
                        if(cake[p][l]=='.'){cakeans[p][l]=num;}else{p++;break;}
                    }
                    int q = i;//tate
                    while(true){
                        q+=1;
                        if(q==h){break;}
                        if(cake[q][l]=='.'){cakeans[q][l]=num;}else{break;}
                    }
                    int m = l;//yoko
                    while(true){
                        m-=1;
                        boolean flg = true;
                        if(m==-1){break;}
                        for(int x=p;x<q;x++){if(cake[x][m]=='#'){flg=false;break;}}
                        if(flg){for(int x=p;x<=q;x++){cakeans[x][m]=num;}}else{break;}
                    }
                    int n = l ;//yoko
                    while(true){
                        n+=1;
                        boolean flg = true;
                        if(n==w){break;}
                        for(int x=p;x<q;x++){if(cake[x][n]=='#'){flg=false;break;}}
                        if(flg){for(int x=p;x<=q;x++){cakeans[x][n]=num;}}else{break;}
                    }
                    num++;
                }
            }
        }

        for(int i=0;i<h;i++){
            for(int l=0;l<w;l++){
                System.out.print(cakeans[i][l]);
            }
            System.out.println();
        }
    }
}