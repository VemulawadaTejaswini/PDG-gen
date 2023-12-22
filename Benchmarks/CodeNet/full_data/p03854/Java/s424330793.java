import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine().trim();
            while(s.length() > 0){
                if(s.endsWith("dreamer")){
                    s = s.substring(0, s.length() - 7);
                }else if(s.endsWith("eraser")){
                    s = s.substring(0, s.length() - 6);
                }else if(s.endsWith("dream")){
                    s = s.substring(0, s.length() - 5);
                }else if(s.endsWith("erase")){
                    s = s.substring(0, s.length() - 5);
                }else{
                    break;
                }
            }
            if(s.length() == 0){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
