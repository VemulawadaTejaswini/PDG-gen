import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] XYZK = str.split(" ");
        str = br.readLine();
        String[] A = str.split(" ");
        str = br.readLine();
        String[] B = str.split(" ");
        str = br.readLine();
        String[] C = str.split(" ");
        ArrayList<Long> AB = new ArrayList<Long>();
        for (int i=0;i<Integer.parseInt(XYZK[0]);i++){
            for (int j=0;j<Integer.parseInt(XYZK[1]);j++){
                AB.add(Long.parseLong(A[i])+Long.parseLong(B[j]));
            }
        }
        Long[] AB_ = AB.toArray(new Long[AB.size()]);
        Arrays.sort(AB_,Collections.reverseOrder());
        int min = Integer.parseInt(XYZK[3]);
        if (min>AB_.length){
            min = AB_.length;
        }
        Arrays.sort(C,Collections.reverseOrder());
        ArrayList<Long> ABC = new ArrayList<>();
        for (int i=0;i<min;i++){
            for (int j=0;j<Integer.parseInt(XYZK[2]);j++){
                ABC.add(AB_[i]+Long.parseLong(C[j]));
            }
        }
        Long[] ABC_ = ABC.toArray(new Long[ABC.size()]);
        Arrays.sort(ABC_,Collections.reverseOrder());
        for (int i=0;i<Integer.parseInt(XYZK[3]);i++){
            System.out.println(ABC_[i]);
        }
    }
}