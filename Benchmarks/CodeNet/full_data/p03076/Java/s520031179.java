import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int[] dishes = new int[5];
        for (int i=0;i<5;i++){
            str = br.readLine();
            dishes[i] = Integer.parseInt(str);
        }
        ArrayList<Integer> time = new ArrayList<Integer>();
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i==j){
                    continue;
                }
                for (int k=0;k<5;k++){
                    if (i==k || j==k){
                        continue;
                    }
                    for (int l=0;l<5;l++){
                        if (i==l || j==l || k==l){
                            continue;
                        }
                        for (int m=0;m<5;m++){
                            if (i==m || j==m || k==m || l==m){
                                continue;
                            }
                            time.add((dishes[i]+9)/10*10 + (dishes[j]+9)/10*10 + (dishes[k]+9)/10*10 + (dishes[l]+9)/10*10 + dishes[m]);
                        }
                    }
                }
            }
        }
        Integer[] ti = time.toArray(new Integer[time.size()]);
        int ans = ti[0];
        for (int i:time){
            if (i<ans){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}