import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            while(input.equals("")){
                if(input.endsWith("dream")){
                    input = input.substring(0, input.length() - 6);
                }else if(input.endsWith("dreamer")){
                    input = input.substring(0, input.length() - 8);
                }else if(input.endsWith("erase")){
                    input = input.substring(0, input.length() - 6);
                }else if(input.endsWith("eraser")){
                    input = input.substring(0, input.length() - 7);
                }else{
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
