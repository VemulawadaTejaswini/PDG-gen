import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.next());
        int prevT=0;
        int prevX=0;
        int prevY=0;
        for (int i=0;i<N;i++){
            int nextT=Integer.parseInt(sc.next());
            int nextX=Integer.parseInt(sc.next());
            int nextY=Integer.parseInt(sc.next());
            int dt=nextT-prevT;
            int dist=Math.abs(nextX-prevX)+Math.abs(nextY-prevY);
            if ((dt<dist)||((dist-dt)%2!=0)){
                System.out.println("No");
                return;
            }
            prevT=nextT;
            prevX=nextX;
            prevY=nextY;
        }
        System.out.println("Yes");
    }
}