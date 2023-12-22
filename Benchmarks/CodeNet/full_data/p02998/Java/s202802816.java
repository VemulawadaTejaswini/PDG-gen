import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Zahyo> zahyoList = new ArrayList<>();
        Set<Zahyo> zahyoSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Zahyo zahyo = new Zahyo(x, y);
            zahyoList.add(zahyo);
            zahyoSet.add(zahyo);
        }
        sc.close();

        for (int i = 0; i < zahyoList.size(); i++) {
            Zahyo zahyoI = zahyoList.get(i);

            for (int j = i + 1; j < zahyoList.size(); j++) {
                Zahyo zahyoJ = zahyoList.get(j);

                for (int k = j + 1; k < zahyoList.size(); k++) {
                    Zahyo zahyoK = zahyoList.get(k);

                    if(!isIikanzi(zahyoI, zahyoJ, zahyoK)) continue;
                    
                    Zahyo kouho = getIikanziNoZahyo(zahyoI, zahyoJ, zahyoK);
                    
                    if(zahyoSet.contains(kouho)) {
                        continue;
                    }else {
                        zahyoList.add(kouho);
                        zahyoSet.add(kouho);
                    }
                }
            }
        }
        
        System.out.println(zahyoList.size()-N);
    }

    private static boolean isIikanzi(Zahyo a, Zahyo b, Zahyo c) {
        //3点が一直線上にある場合
        if (a.x == b.x && b.x == c.x)
            return false;
        if (a.y == b.y && b.y == c.y)
            return false;

        //x座標とy座標が全部違う場合
        if (a.x != b.x && b.x != c.x && c.x != a.x)
            return false;
        if (a.y != b.y && b.y != c.y && c.y != a.y)
            return false;

        return true;
    }
    
    private static Zahyo getIikanziNoZahyo(Zahyo a, Zahyo b, Zahyo c) {
        int xNew = a.x != b.x&& a.x != c.x ? a.x : b.x != a.x && b.x != c.x ? b.x : c.x;
        int yNew = a.y != b.y&& a.y != c.y ? a.y : b.y != a.y && b.y != c.y ? b.y : c.y;
        return new Zahyo(xNew, yNew);
    }

}

class Zahyo {
    int x;
    int y;

    public Zahyo(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Zahyo other = (Zahyo) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

}