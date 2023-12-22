import java.util.*;
import java.lang.*;

class Section{
    double min, max;
    public Section(double min, double max){
        this.min=min;
        this.max=max;
    }
    public Section(double elm){
        this(elm,elm);
    }
    public Section(){
        this(1e12, -1e12);
    }
    public void add(double elm){
        this.min = Math.min(this.min, elm);
        this.max = Math.max(this.max, elm);
    }
    public double minimum(){return min;}
    public double maximum(){return max;}
    public String toString(){
        return "["+min+", "+max+"]";
    }
}

public class Main {
    static double score(Section xStop, Section yStop, Section left, Section right, Section up, Section down, double time){
        double xMax = Math.max(xStop.maximum(), Math.max(left.maximum()-time, right.maximum()+time));
        double xMin = Math.min(xStop.minimum(), Math.min(left.minimum()-time, right.minimum()+time));
        double yMax = Math.max(yStop.maximum(), Math.max(up.maximum()+time, down.maximum()-time));
        double yMin = Math.min(yStop.minimum(), Math.min(up.minimum()+time, down.minimum()-time));
        return (xMax-xMin)*(yMax-yMin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Section xStop = new Section();
        Section yStop = new Section();
        Section left = new Section();
        Section right = new Section();
        Section up = new Section();
        Section down = new Section();

        for(int n=0; n<N; n++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            char d = sc.next().charAt(0);
            switch(d){
                case 'R':
                    right.add(x);
                    yStop.add(y);
                    break;
                case 'L':
                    left.add(x);
                    yStop.add(y);
                    break;
                case 'U':
                    up.add(y);
                    xStop.add(x);
                    break;
                case 'D':
                    down.add(y);
                    xStop.add(x);
                    break;
            }
        }

        for(double t=0; t<10; t+=0.1) score(xStop,yStop,left,right,up,down,t);

        double minTime = 0, maxTime = 1e12;
        for(int q=0; q<1000; q++){
            double early = (minTime*2+maxTime)/3;
            double late = (minTime+maxTime*2)/3;
            if(score(xStop,yStop,left,right,up,down,early) < score(xStop,yStop,left,right,up,down,late)){
                maxTime = late;
            }
            else minTime = early;
        }
        System.out.println(score(xStop,yStop,left,right,up,down,minTime));

    }
}