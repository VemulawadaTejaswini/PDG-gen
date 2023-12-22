import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        int count = 0;
        int[] input = null;
        int[] box = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = bufferedReader.readLine();
            String str2 = bufferedReader.readLine();
            String[] st = str2.split(" ");
            count = Integer.parseInt(str);
            input = new int[count];
            box = new int[count];
            int c = 0;
            for(String s: st){
                int a = Integer.parseInt(s);
                input[c] = a;
                box[a]++;
                c++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        if(input[0] > 0 || box[0] > 1){
            System.out.println(0);
        } else{
            int ans = 1;
            for(int i = 2;i < count;i++){
                if(box[i] == 0){
                    break;
                }
                ans = ans * (int)Math.pow(i,box[i]);
            }
            System.out.println("" + ans);
        }

    }
}