import java.io.InputStream;
import java.io.IOException;
import java.util.HashSet;

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
        HashSet<Integer> set = new HashSet<Integer>();
        int n = sc.nextInt(), m = sc.nextInt();
        boolean[] selected = new boolean[m];
        for(int i = 0; i < m; i++){
            set.add(i);
        }
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                selected[j] = true;
            }
            int c = sc.nextInt();
            for(int j = 0; j < c; ++j){
                selected[sc.nextInt() - 1] = false;
            }
            for(int j = 0; j < m; ++j){
                if(selected[j]){
                    set.remove(j);
                }
            }
        }
        System.out.println(set.size());
    }
}
