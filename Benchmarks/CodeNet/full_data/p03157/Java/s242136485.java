import java.util.*;
public class Main {
    static int even=0;
    static int odd=0;
    static boolean[][] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        String[] S=new String[H];
        for(int i=0;i<H;i++){
            S[i]=sc.next();
        }
        boolean value[][]=new boolean[H][W];
        for(int h=0;h<H;h++){
            char[] str=S[h].toCharArray();
            for(int w=0;w<W;w++){
                value[h][w]=(str[w]=='.')^((w+h)%2==0);
            }
        }
        visit=new boolean[H][W];
        for(int h=0;h<H;h++){
            for(int w=0;w<W;w++){
                visit[h][w]=false;
            }
        }
        long result=0;
        Mainloop:
        while(true){
            for(int h=0;h<H;h++){
                for(int w=0;w<W;w++){
                    if(!visit[h][w]){
                        even=0;
                        odd=0;
                        if((w+h)%2==0){
                            even++;
                        }else{
                            odd++;
                        }
                        visit[h][w]=true;
                        search(value,w,h,value[h][w]);
                        result+=even*odd;
                        continue Mainloop;

                    }
                }
            }
            break;

        }





        System.out.println(result);
    }
    static void search(boolean value[][],int x,int y,boolean target){
        if(x>0){
            if((!visit[y][x-1])&&(value[y][x-1]==target)){
                if((x-1+y)%2==0){
                    even++;
                }else{
                    odd++;
                }
                visit[y][x-1]=true;
                search(value,x-1,y,target);
            }
        }
        if(y>0){
            if((!visit[y- 1][x])&&(value[y-1][x]==target)){
                if((x-1+y)%2==0){
                    even++;
                }else{
                    odd++;
                }
                visit[y-1][x]=true;
                search(value,x,y-1,target);
            }
        }
        if(x+1<value[0].length){
            if((!visit[y][x+1])&&(value[y][x+1]==target)){
                if((x+1+y)%2==0){
                    even++;
                }else{
                    odd++;
                }
                visit[y][x+1]=true;

                search(value,x+1,y,target);
            }
        }
        if(y+1<value.length){
            if((!visit[y+ 1][x])&&(value[y+1][x]==target)){
                if((x+1+y)%2==0){
                    even++;
                }else{
                    odd++;
                }
                visit[y+1][x]=true;
                search(value,x,y+1,target);
            }
        }
    }



}