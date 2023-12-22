import java.util.*;
import java.awt.*;
 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        int n =Integer.parseInt(s);
        ArrayList<Point> pList = new ArrayList<Point>();
        ArrayList<Point> diffpList = new ArrayList<Point>();
        int ans = 1;
        int max = 0;
        for(int i = 0; i < n; i++){
            int x =Integer.parseInt(sc.next());
            int y =Integer.parseInt(sc.next());
            pList.add(new Point(x,y));
        }
        for(int i = 0; i < pList.size()-1; i++)
        {
            int px = pList.get(i+1).x-pList.get(i).x;
            int py = pList.get(i+1).y-pList.get(i).y;
            diffpList.add(new Point(px,py));
            //System.out.println(new Point(px,py));

        }
        for(int i = 0; i < diffpList.size(); i++){
            int tmpP = 1;
            for(int j = 0; j < diffpList.size(); j++){      
                if(i==j)continue;
                if(diffpList.get(i).equals(diffpList.get(j))){
                    if(diffpList.get(i).x != 0 &&
                        diffpList.get(i).y != 0)tmpP++;
                }
            }
            max = Math.max(max,tmpP);
        }
        ans = n - max;

        if (max == n) ans =1;
        if(n == 2) ans =1;
        System.out.println(ans);
        /*
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int h = Integer.parseInt(tokens[0]);
                int w = Integer.parseInt(tokens[1]);
                
                }
            }
        }
        */
    }
}