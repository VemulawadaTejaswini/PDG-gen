import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] A = new String[n];
        String[] B = new String[m];

        for (int i=0; i<n; i++)
            A[i] = br.readLine();

        for (int i=0; i<m; i++)
            B[i] = br.readLine();
        boolean flag = false;
        int i=0;
        while(i<A.length){
            int j=0,I=i;
            while (j<B.length && I<A.length){
                if (A[I].startsWith(B[j])){
                    I++;
                    j++;
                }
                else{
                    i++;
                    break;
                }
            }
            if(j==B.length){
                flag=true;
                break;
            }

        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }


}
