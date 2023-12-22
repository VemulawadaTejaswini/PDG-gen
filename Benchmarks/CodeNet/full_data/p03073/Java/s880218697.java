import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split("");
        int[] color = new int[str.length];
        for(int i = 0; i < color.length; i++){
            color[i] = Integer.parseInt(str[i]);
        }
        int num1 = 0,
            num2 = 0;
        for(int i = 0; i < color.length; i++){
            if(i%2 == color[i]){
                num1++;
            }
            else{
                num2++;
            }
        }        
        System.out.println(Math.min(num1, num2));
    }
}