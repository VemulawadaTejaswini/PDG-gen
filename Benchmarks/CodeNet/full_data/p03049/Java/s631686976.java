import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();      
        int N = r.i();
        int a = 0,
            b = 0,
            c = 0,
        count = 0;
        for(int i = 0; i < N; i++){
            String s = r.s();
            int len = s.length();
            for(int j = 0; j < len-1; j++){
                if(s.charAt(j) == 'A'){
                    if(s.charAt(j+1) == 'B'){
                        count++;
                    }
                }
            }
            int state = 0;            
            if(s.charAt(0) == 'B'){
                state++;
            } 
            if(s.charAt(len-1) == 'A'){
                state += 2;
            }
            switch(state){
                case 1:
                b++;
                break;
                case 2:
                a++;
                break;
                case 3:
                c++;
                a++;
                b++;
                break;                    
            }
        }
        count += Math.min(a, b);
        if(c > 0 && a == 0 && b == 0){
            count--;
        }
        print(count);        
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int Int(String s){
            return Integer.parseInt(s);
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}