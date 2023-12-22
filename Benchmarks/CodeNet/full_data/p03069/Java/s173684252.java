import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int min;
        int count = 0;
        for(int i = 0; i < N; i++){
            if(S.charAt(i) == '.'){
                count++;
            }
        }
        min = count;
        for(int i = 0; i < N && 0 < min; i++){
            if(S.charAt(i) == '#'){
                count++;
            } else{
                count--;
                if(count < min){
                    min = count;
                }
            }            
        }           
        System.out.println(min);
    }
}