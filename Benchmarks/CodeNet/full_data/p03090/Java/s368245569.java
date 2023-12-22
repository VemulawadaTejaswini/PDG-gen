import java.util.*;
import java.io.*;


interface Ball{
    int getRadius();
    int getPoint();
    boolean isPlaced();
    int distanceTo(Ball another);
    boolean collide(Ball another);
    String coordinate();
}
class PlacedBall implements Ball{
    int radius;
    int point;
    int x, y, z;
    public PlacedBall(int r, int p, int x, int y, int z){
        this.radius = r;
        this.point = p;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public PlacedBall(Ball b, int x, int y, int z){
        this(b.getRadius(), b.getPoint(), x,y,z);
    }

    public int getRadius(){return radius;}
    public int getPoint(){return point;}
    public boolean isPlaced(){return true;}
    public int distanceTo(Ball another){
        if(another.isPlaced()){
            return (this.x-((PlacedBall)another).x)*(this.x-((PlacedBall)another).x) +
                   (this.y-((PlacedBall)another).y)*(this.y-((PlacedBall)another).y) +
                   (this.z-((PlacedBall)another).z)*(this.z-((PlacedBall)another).z) ;
        }else return 5000000;
    }
    public boolean collide(Ball another){
        return this.distanceTo(another) >= (this.getRadius()+another.getRadius())*(this.getRadius()+another.getRadius());
    }

    public String coordinate(){
        return x+" "+y+" "+z;
    }
}
class removedBall implements Ball{
    int radius;
    int point;
    public removedBall(int r, int p){
        this.radius = r;
        this.point = p;
    }
    public removedBall(Ball b){
        this(b.getRadius(), b.getPoint());
    }

    public int getRadius(){return radius;}
    public int getPoint(){return point;}
    public boolean isPlaced(){return false;}
    public int distanceTo(Ball another){
        return 5000000;
    }
    public boolean collide(Ball another){
        return false;
    }

    public String coordinate(){
        return "-1 -1 -1";
    }
}

class PairBonus{
    int ball1, ball2;
    int distance;
    int point;
    public PairBonus(int b1Num, int b2Num, int d, int p){
        this.ball1 = b1Num;
        this.ball2 = b2Num;
        this. distance = d*d;
        this.point = p;
    }
    public boolean getBonus(Ball b1, Ball b2){
        return b1.distanceTo(b2) <= this.distance;
    }
    public boolean getBonus(Ball[] balls){
        return getBonus(balls[ball1], balls[ball2]);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        int M = (N%2==0) ? N * (N-2) / 2 : ((N-1)*(N-3)/2 + N-1);
        System.out.println(M);
        for(int i=1; i<=N; i++) for(int j=i+1; j<=N; j++){
            if(i<j && i+j!=(N/2)*2+1) System.out.println(i+" "+j);
        }

    }
}
