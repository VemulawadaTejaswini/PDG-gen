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
        MyScanner sc = new MyScanner();
        int k = sc.nextInt(), t = sc.nextInt();
        int max = 0;
        for(int i = 0; i < t; ++i){
            int a = sc.nextInt();
            if(max < a){
                max = a;
            }
        }
        int fill = k / 2 + (k % 2);
        if(t == 1){
            System.out.println(k - 1);
        }else if(max <= fill){
            System.out.println(0);
        }else{
            System.out.println(max - fill);
        }
    }
}
