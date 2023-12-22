import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] red = new int[a];
        int[] gre = new int[b];
        int[] col = new int[c];
        for(int i=0;i<a;i++) red[i] = in.nextInt();
        for(int i=0;i<b;i++) gre[i] = in.nextInt();
        for(int i=0;i<c;i++) col[i] = in.nextInt();
        int pta = a-1;
        int ptb = b-1;
        int ptc = c-1;
        long sum=0L;
        Arrays.sort(red);
        Arrays.sort(gre);
        Arrays.sort(col);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<x;i++){
            lst.add(red[a-1-i]);
        }
        for(int i=0;i<y;i++){
            lst.add(gre[b-1-i]);
        }
        Collections.sort(lst);
        int pt = x+y-1;
        int pt2=c-1;
        for(int i=0;i<x+y;i++){
            if(pt2>=0 && col[pt2]>lst.get(pt)) {sum+=col[pt2];--pt2;}
            else {sum+=lst.get(pt);--pt;}
        }
        System.out.println(sum);
        
    }
}