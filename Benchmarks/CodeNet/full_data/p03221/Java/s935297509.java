import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int[] a = r.ii();
        int N = a[0],
            M = a[1];        
        int[][] data = new int[M][3];
        ArrayList<int[]>[] prefs = new ArrayList[N+1];
        for(int i = 0; i < M; i++){
            int[] PY = r.ii();
            int P = PY[0],
                Y = PY[1];
            data[i] = new int[]{P, Y, 0};
            if(prefs[P] == null) prefs[P] = new ArrayList<>();
            prefs[P].add(data[i]);
        }
        for(ArrayList<int[]> pref : prefs){
            if(pref != null){
                pref.sort(Comparator.comparing(iData->iData[1]));
                int i = 1;
                for(int[] iData : pref){
                    iData[2] = i++;
                }
            }
        }                
        for(int i = 0; i < M; i++){
            System.out.printf("%06d",data[i][0]);
            System.out.printf("%06d\n", data[i][2]);
        }     
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String[] ss() throws IOException{
            return readLine().split(" ");
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
    }
}