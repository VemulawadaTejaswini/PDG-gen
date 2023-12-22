import java.util.*;


class CheckerBoard{
    private int patternSize;
    private int patternStartX, patternStartY;

    CheckerBoard(int s){
        this.patternSize = s;
        this.patternStartX = 0;
        this.patternStartY = 0;
    }

    public boolean checkPatternBoolean(int x, int y, boolean b){
        int divX = ((x + this.patternStartX) / this.patternSize) % 2;
        int divY = ((y + this.patternStartY) / this.patternSize) % 2;
        boolean isWhite = (divX == divY);
        if(b == isWhite){
            return true;
        }
        return false;
    }

    public void setX(int x){
        this.patternStartX = x;
    }
    public void setY(int y){
        this.patternStartY = y;
    }

    public int getPatternSize() {
        return patternSize;
    }

}


class Demand{
    int x;
    int y;
    boolean c;

    Demand(int x, int y, boolean c){
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isC() {
        return c;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        CheckerBoard cb = new CheckerBoard(k);
        ArrayList<Demand> demands = new ArrayList<Demand>();
        HashSet<Integer> xSet = new HashSet<Integer>();
        HashSet<Integer> ySet = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean c = sc.next().endsWith("W");
            demands.add(new Demand(x, y ,c));
            xSet.add(x+k);;
            ySet.add(y+k);
            ySet.add(x+k-1);
            ySet.add(y+k-1);
        }

        int max = 0;

        for(int x : xSet){
            cb.setX(x);
            for(int y : ySet){
                cb.setY(y);
                int currentDemandCount = 0;
                for(Demand d : demands){
                    if(cb.checkPatternBoolean(d.getX(), d.getY(), d.isC())){
                        currentDemandCount++;
                    }
                }
                if(currentDemandCount > max){
                    max = currentDemandCount;
                }
            }
        }

        System.out.println(max);
    }
}
