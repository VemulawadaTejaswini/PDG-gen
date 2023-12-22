import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int nowX = sx;
        int nowY = sy;
        char next;
        
        for(int i=0; i<((tx-sx)+(ty-sy))*2; i++){
            if(nowX < tx && nowY == sy){
                System.out.print('R');
                nowX++;
            }else if(nowX == tx && nowY < ty){
                System.out.print('U');
                nowY++;
            }else if(nowY == ty && nowX > tx){
                System.out.print('L');
                nowX--;
            }else if(nowX == sx && nowY > sy){
                System.out.print('D');
                nowY--;
            }
        }
        System.out.print('D');
        nowY--;
        for(int i=0; i<tx-sx+1; i++){
            System.out.print('R');
            nowX++;
        }
        for(int i=0; i<ty-sy+1; i++){
            System.out.print('U');
            nowY++;
        }
        System.out.print('L');
        nowX--;
        System.out.print('U');
        nowY++;
        for(int i=0; i<tx-sx+1; i++){
            System.out.print('L');
            nowX--;
        }
        for(int i=0; i<ty-sy+1; i++){
            System.out.print('D');
            nowY--;
        }
        System.out.println('R');
        nowX++;       
    }
}