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
            int lastIndexOf=-1;
            while (j<B.length && I<A.length){
                int indexOf = A[I].indexOf(B[j]);
                if (indexOf!=-1){
                    if(j==0){
                        lastIndexOf=indexOf;
                    }
                    else{
                        if (indexOf!=lastIndexOf)
                            break;
                    }
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
            if(I==A.length){
                break;
            }

        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }


}
