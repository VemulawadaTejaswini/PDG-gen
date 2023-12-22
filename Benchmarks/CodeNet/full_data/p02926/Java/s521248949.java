import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        double[] xx = new double[n];
        double[] yy = new double[n];

        for(int i = 0;i < n;i++){
            xx[i] = stdIn.nextDouble();
            yy[i] = stdIn.nextDouble();
        }

        for(int i = 0;i < n;i++){
            x[i] = xx[i];
            y[i] = yy[i];
        }

        double max = 0;
        double dx = 0;
        double dy = 0;

        for(int i = 0;i < n;i++) {
            if(x[i] >= 0 && y[i] >= 0){
                dx += x[i];
                dy += y[i];
                x[i] = 0;
                y[i] = 0;
            }
        }
        for(int i = 0;i < n;i++){
            if(x[i] >=0 && y[i] >= 0){
                dx += x[i];
                dy += y[i];
            }else if(x[i] <= 0 && y[i] >= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dx+x[i]>=0){
                    dx += x[i];
                    dy += y[i];
                }
            }else if(x[i] >= 0 && y[i] <= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dy+y[i]>=0){
                    dx += x[i];
                    dy += y[i];
                }
            }
        }

        max = (Math.sqrt(dx*dx+dy*dy));
        dx = 0;
        dy = 0;

        for(int i = 0;i < n;i++){
            x[i] = xx[i];
            y[i] = yy[i];
        }
        for(int i = 0;i < n;i++) {
            if(x[i] <= 0 && y[i] >= 0){
                dx += x[i];
                dy += y[i];
                x[i] = 0;
                y[i] = 0;
            }
        }
        for(int i = 0;i < n;i++){
            if(x[i] <=0 && y[i] >= 0){
                dx += x[i];
                dy += y[i];
            }else if(x[i] >= 0 && y[i] >= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dx+x[i]<=0){
                    dx += x[i];
                    dy += y[i];
                }
            }else if(x[i] <= 0 && y[i] <= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dy+y[i]>=0){
                    dx += x[i];
                    dy += y[i];
                }
            }
        }

        if(Math.sqrt(dx*dx+dy*dy) > max) {
            max = Math.sqrt(dx*dx+dy*dy);
        }
        dx = 0;
        dy = 0;

        for(int i = 0;i < n;i++){
            x[i] = xx[i];
            y[i] = yy[i];
        }
        for(int i = 0;i < n;i++) {
            if(x[i] <= 0 && y[i] <= 0){
                dx += x[i];
                dy += y[i];
                x[i] = 0;
                y[i] = 0;
            }
        }

        for(int i = 0;i < n;i++){
            if(x[i] <=0 && y[i] <= 0){
                dx += x[i];
                dy += y[i];
            }else if(x[i] <= 0 && y[i] >= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dy+y[i]<=0){
                    dx += x[i];
                    dy += y[i];
                }
            }else if(x[i] >= 0 && y[i] <= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dx+x[i]<=0){
                    dx += x[i];
                    dy += y[i];
                }
            }
        }

        if(Math.sqrt(dx*dx+dy*dy) > max) {
            max = Math.sqrt(dx*dx+dy*dy);
        }
        dx = 0;
        dy = 0;

        for(int i = 0;i < n;i++){
            x[i] = xx[i];
            y[i] = yy[i];
        }
        for(int i = 0;i < n;i++) {
            if(x[i] >= 0 && y[i] <= 0){
                dx += x[i];
                dy += y[i];
                x[i] = 0;
                y[i] = 0;
            }
        }

        for(int i = 0;i < n;i++){
            if(x[i] >=0 && y[i] <= 0){
                dx += x[i];
                dy += y[i];
            }else if(x[i] >= 0 && y[i] >= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dy+y[i]<=0){
                    dx += x[i];
                    dy += y[i];
                }
            }else if(x[i] <= 0 && y[i] <= 0){
                if(Math.sqrt(dx*dx+dy*dy) < Math.sqrt((dx+x[i])*(dx+x[i])+(dy+y[i])*(dy+y[i])) && dx+x[i]>=0){
                    dx += x[i];
                    dy += y[i];
                }
            }
        }

        if(Math.sqrt(dx*dx+dy*dy) > max) {
            max = Math.sqrt(dx*dx+dy*dy);
        }

        System.out.println(max);

        
    }

}