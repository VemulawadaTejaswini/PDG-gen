import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class MyScanner{
    InputStream stream;
    public MyScanner(){
        stream = System.in;
    }
    
    public int nextInt(){
        int ret = 0;
        try{
            while(true){
                char readed = (char)stream.read();
                if(readed < '0' || readed > '9'){
                    break;
                }
                ret = ret * 10 + (readed - '0');
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return ret;
        }
    }
}

class Main {
    public static void main(String args[]) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            MyScanner sc = new MyScanner();
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            a += b;
            int passed = 0, ab = 0;
            char[] s = br.readLine().toCharArray();
            for(int i = 0; i < n; ++i){
                if(s[i] == 'b'){
                    ab++;
                }
                if(s[i] == 'a' && passed < a){
                    ++passed;
                    System.out.println("Yes");
                }else if(s[i] == 'b' && passed < a && ab <= b){
                    ++passed;
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
