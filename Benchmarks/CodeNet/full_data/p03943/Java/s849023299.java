import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String[] cou = num.split(" ",0);

        int[] out = new int[3];

        for(int i = 0; i < cou.length; i++){
            out[i] = Integer.parseInt(cou[i]);
        }

        String j;
        if(out[0]+out[1] == out[2]){
            j = "Yes";
        }else if(out[0]+out[2] == out[1]){
            j = "Yes";
        }else if(out[1]+out[2] == out[0]){
            j = "Yes";
        }else{
            j = "No";
        }

        System.out.println(j);
    }
}
