import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
/*        int a[][][] = new int[H][W][H * W];*/
    
        Map<Integer, Integer> h = new HashMap<Integer, Integer>();
        Map<Integer, Integer> w = new HashMap<Integer, Integer>();
        int num = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if (sc.nextInt() % 2 == 1);
                {
                    h.put(num, i);
                    w.put(num, j);
                    num++;
                }
            }
        }
        for(int i = 0; i < num; i += 2){
            int y1 = h.get(i); 
            int x1 = w.get(i);
            int y2 = h.get(i+1);
            int x2 = w.get(i+1);

            int k = -1;
            if(h.get(i) <= h.get(i + 1)){k = 1;};
            while(y1 != y2){
                System.out.println((y1+1) + " " + (x1+1) + " " + (y1+k+1) + " " + (x1+1));
                y1 += k;
            }

            int l = -1;
            if(w.get(i) <= w.get(i + 1)){l = 1;};
            while(x1 != x2){
                System.out.println((y1+1) + " " + (x1+1) + " " + (y1+1) + " " + (x1 + k + 1));
                x1 += k;
            }
        }

    }
}