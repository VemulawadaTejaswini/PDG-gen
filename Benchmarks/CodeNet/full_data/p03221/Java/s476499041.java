import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int[] a = r.ii();
        int N = a[0],
            M = a[1];        
        int[][] data = new int[M][3];
        HashMap<Integer, ArrayList<int[]>> prefs = new HashMap<>();
        for(int[] iData : data){
            int[] PY = r.ii();
            int P = PY[0];
            iData[0] = P;
            iData[1] = PY[1];
            if(!prefs.containsKey(P)){
                prefs.put(P, new ArrayList<>());
            }
            prefs.get(P).add(iData);
        }
        for(ArrayList<int[]> pref : prefs.values()){
            pref.sort(Comparator.comparing(iData->iData[1]));
            int i = 1;
            for(int[] iData : pref) iData[2] = i++;
        }                
        for(int[] iData : data) System.out.printf("%06d%06d\n", iData[0], iData[2]);
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