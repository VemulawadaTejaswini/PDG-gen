
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<D> arrayList = new ArrayList<>();
        for (int i = 0;i < n;++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            if(h <= 0)continue;
            D d = new D();
            d.x = x;
            d.y = y;
            d.h = h;
            arrayList.add(d);
        }

        if(arrayList.size() == 1){
            System.out.println(arrayList.get(0).x + " " + arrayList.get(0).y + " " + arrayList.get(0).h);
            return;
        }
        else if(arrayList.size() == 2){
            for (int cx = 0;cx <= 100;++cx){
                for (int cy = 0;cy <= 100;++cy){
                    long a1 = Math.abs(arrayList.get(0).x - cx) + Math.abs(arrayList.get(0).y - cy) + arrayList.get(0).h;
                    long a2 = Math.abs(arrayList.get(1).x - cx) + Math.abs(arrayList.get(1).y - cy) + arrayList.get(1).h;
                    if(a1 == a2){
                        System.out.println(cx + " " + cy + " " + a1);
                        return;
                    }
                }
            }
            return;
        }

        for (int cx = 0;cx <= 100;++cx){
            for (int cy = 0;cy <= 100;++cy){
                long a1 = Math.abs(arrayList.get(0).x - cx) + Math.abs(arrayList.get(0).y - cy) + arrayList.get(0).h;
                long a2 = Math.abs(arrayList.get(1).x - cx) + Math.abs(arrayList.get(1).y - cy) + arrayList.get(1).h;
                long a3 = Math.abs(arrayList.get(2).x - cx) + Math.abs(arrayList.get(2).y - cy) + arrayList.get(2).h;
                if(a1 == a2&&a2 == a3){
                    System.out.println(cx + " " + cy + " " + a1);
                    return;
                }
            }
        }
    }


    static class D{
        long x;
        long y;
        long h;
    }



}


