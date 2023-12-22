import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] NMC = new int[3];
        int cont = 0;
        for (String s:str.split(" ")){
            NMC[cont] = Integer.parseInt(s);
            cont++;
        }
        str = br.readLine();
        int[] B =new int[NMC[1]];
        cont = 0;
        for (String s:str.split(" ")){
            B[cont] = Integer.parseInt(s);
            cont++;
        }
        int res;
        int ans = 0;
        for (int i=0;i<NMC[0];i++){
            str = br.readLine();
            res = 0;
            cont = 0;
            for (String s:str.split(" ")){
                res += Integer.parseInt(s) * B[cont];
                cont++;
            }
            res += NMC[2];
            if (res>0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}