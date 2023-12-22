import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int h=scn.nextInt();
        int w=scn.nextInt();
        char[][] map=new char[h][w];
        for(int i=0;i<h;i++){
            String text=scn.next();
            for(int j=0;j<w;j++){
                map[i][j]=text.charAt(j);
            }
        }
        System.out.println("a");
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                int cnt=0;
                if(i!=0){
                    if(map[i-1][j]=='#') cnt++;
                    if(j!=0){
                    if(map[i-1][j-1]=='#') cnt++;
                    }
                    if(j!=w-1){
                        if(map[i-1][j+1]=='#') cnt++;
                    }
                } 
                if(i!=h-1){
                    if(map[i+1][j]=='#') cnt++;
                    if(j!=0){
                    if(map[i+1][j-1]=='#') cnt++;
                    }
                    if(j!=w-1){
                        if(map[i+1][j+1]=='#') cnt++;
                    }
                } 
                if(j!=0){
                   if( map[i][j-1]=='#') cnt++;
                }
                if(j!=w-1){
                   if( map[i][j+1]=='#') cnt++;
                }
               if(map[i][j]!='#') map[i][j]=(char)(cnt+48);

            }
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
