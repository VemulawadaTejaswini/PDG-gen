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
    
    public char[] readLine(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ret = new char[1];
        try{
            ret = br.readLine().toCharArray();
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
            int h = sc.nextInt(), w = sc.nextInt();
            char[][] cell = new char[h][];
            for(int i = 0; i < h; ++i){
                cell[i] = br.readLine().toCharArray();
            }
            int x = 0, y = 0;
            while(x != h - 1 || y != w - 1){
                if((x > 0 && cell[x - 1][y] == '#') || (y > 0 && cell[x][y - 1] == '#')){
                    System.out.println("Impossible");
                    return;
                }
                boolean right = x < h - 1 && cell[x + 1][y] == '#';
                boolean down  = y < w - 1 && cell[x][y + 1] == '#';
                if(right && down){
                    System.out.println("Impossible");
                    return;
                }
                cell[x][y] = '$';
                if(right && x < h - 1){
                    x++;
                }else if(y < w - 1){
                    y++;
                }
            }
            System.out.println("Possible");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
