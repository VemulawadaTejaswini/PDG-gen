import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int min = N;
        for(int i = 0; i < N; i++){
            for(int j = i, count = 0; j < N; j++, count = 0){
                for(int k = 0; k < j; k++){
                    if(S.charAt(k) == '#'){
                        count++;
                    }
                }
                for(int k = j; k < N; k++){
                    if(S.charAt(k) == '.'){
                        count++;
                    }
                }
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }
}