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
        Arrays.sort(A,Collections.reverseOrder());
        Arrays.sort(B,Collections.reverseOrder());
        Arrays.sort(C,Collections.reverseOrder());
        ArrayList<Long> ABC = new ArrayList<>();
        for (int i=0;i<Integer.parseInt(XYZK[0]);i++){
            for (int j=0;j<Integer.parseInt(XYZK[1]);j++){
                if ((i+1)*(j+1)>Integer.parseInt(XYZK[3])){
                    break;
                }
                for (int k=0;k<Integer.parseInt(XYZK[2]);k++){
                    if ((i+1)*(j+1)*(k+1)>Integer.parseInt(XYZK[3])){
                        break;
                    }
                    ABC.add(Long.parseLong(A[i])+Long.parseLong(B[j])+Long.parseLong(C[k]));
                }
            }
        }
        Collections.sort(ABC,Collections.reverseOrder());
        for (int i=0;i<Integer.parseInt(XYZK[3]);i++){
            System.out.println(ABC.get(i));
        }
    }
}