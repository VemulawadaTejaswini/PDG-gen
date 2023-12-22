import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] XYZK = str.split(" ");
        int X = Integer.parseInt(XYZK[0]);
        int Y = Integer.parseInt(XYZK[1]);
        int Z = Integer.parseInt(XYZK[2]);
        int K = Integer.parseInt(XYZK[3]);
        int cont = 0;
        str = br.readLine();
        Long[] A = new Long[X];
        for (String s:str.split(" ")){
            A[cont] = Long.parseLong(s);
            cont++;
        }
        str = br.readLine();
        Long[] B = new Long[Y];
        cont = 0;
        for (String s:str.split(" ")){
            B[cont] = Long.parseLong(s);
            cont++;
        }
        str = br.readLine();
        Long[] C = new Long[Z];
        cont = 0;
        for (String s:str.split(" ")){
            C[cont] = Long.parseLong(s);
            cont++;
        }
        ArrayList<Long> AB = new ArrayList<>();
        for (int i=0;i<X;i++){
            for (int j=0;j<Y;j++){
                AB.add(A[i]+B[j]);
            }
        }
        AB.sort(Comparator.reverseOrder());
        ArrayList<Long> ABC = new ArrayList<>();
        for (int i=0;i<Math.min(AB.size(),K);i++){
            for (int j=0;j<Z;j++){
                ABC.add(AB.get(i)+C[j]);
            }
        }
        ABC.sort(Comparator.reverseOrder());
        for (int i=0;i<K;i++){
            System.out.println(ABC.get(i));
        }
    }
}