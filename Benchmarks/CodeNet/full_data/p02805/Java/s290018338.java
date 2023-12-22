import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        int[] x = new int[n+1];
        int[] y = new int[n+1];
        
        for(int i=0; i<n; i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        
        double min = (int)1e9;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    //3点選ぶ
                    Circle c = calcCenter(x[i],y[i],x[j],y[j],x[k],y[k]);
                    double r = c.r;
                    double ox = c.x;
                    double oy = c.y;
                    boolean f = true;
                    for(int l=0; l<n; l++){
                        double a = Math.abs(ox-x[l]);
                        double b = Math.abs(oy-y[l]);
                        if(Math.sqrt(a*a + b*b) > r+0.0000001){
                            f = false;
                            break;
                        }
                    }
                    if(f){
                        min = Math.min(min, r);
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                //2点選ぶ
                Circle c = calcCenter(x[i],y[i],x[j],y[j]);
                double r = c.r;
                double ox = c.x;
                double oy = c.y;
                boolean f = true;
                for(int l=0; l<n; l++){
                    double a = Math.abs(ox-x[l]);
                    double b = Math.abs(oy-y[l]);
                    if(Math.sqrt(a*a + b*b) > r+0.0000001){
                        f = false;
                        break;
                    }
                }
                if(f){
                    min = Math.min(min, r);
                }
            }
        }
        
        System.out.println(min);
    }
    
    public static Circle calcCenter(int x1, int y1, int x2, int y2, int x3, int y3){
        double ox = 0;
        double oy = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        double r = 0;
        
        a = x2 - x1;
        b = y2 - y1;
        c = x3 - x1;
        d = y3 - y1;
        
        if  ((a>0 && d>0) || (b>0 && c>0)) {
                ox = x1 + (d * (a * a + b * b) - b * (c * c + d * d)) / (a * d - b * c) / 2 ;
                if(b>0){
                        oy = (a * (x1 + x2 - ox - ox) + b * (y1 + y2)) / b / 2 ;
                }else{
                        oy = (c * (x1 + x3 - ox - ox) + d * (y1 + y3)) / d / 2 ;
                }
                r1   = Math.sqrt((ox - x1) * (ox - x1) + (oy - y1) * (oy - y1)) ;
                r2   = Math.sqrt((ox - x2) * (ox - x2) + (oy - y2) * (oy - y2)) ;
                r3   = Math.sqrt((ox - x3) * (ox - x3) + (oy - y3) * (oy - y3)) ;
                r  = (r1 + r2 + r3) / 3.0 ;
	}
        
        return new Circle(r, ox, oy);
    }
    
    public static Circle calcCenter(int x1, int y1, int x2, int y2){
        double ox = ((double)x1+x2)/2;
        double oy = ((double)y1+y2)/2;
        double a = x1 - x2;
        double b = y1 - y2;
        
        double r = Math.sqrt(a*a+b*b)/2;
        
        return new Circle(r, ox, oy);
    }
}

class Circle{
    public double r;
    public double x;
    public double y;
    public Circle(double r, double x, double y){
        this.r = r;
        this.x = x;
        this.y = y;
    }
}
