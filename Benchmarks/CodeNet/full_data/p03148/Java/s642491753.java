import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }

    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
class Sushi{
    int kind;
    int val;
    Sushi(int kind,int val){
        this.kind = kind;
        this.val = val;
    }
}
public class Main{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int k = fs.nextInt();
        Sushi[] td = new Sushi[n];
        for(int i=0;i<n;i++){
           td[i] = new Sushi(fs.nextInt(),fs.nextInt());
        }
        //おいしさの降順にソート
        Arrays.sort(td,new Comparator<Sushi>(){

            @Override
            public int compare(Sushi o1, Sushi o2) {
                return o2.val-o1.val;
            }
        });
        
        PriorityQueue<Sushi> queue = new PriorityQueue<Sushi>(new Comparator<Sushi>(){
			@Override
			public int compare(Sushi o1, Sushi o2) {
				return o1.val-o2.val;
			}
        });
        Map<Integer,Integer> kind = new HashMap<>();
        long sum = 0;
        int idx = 0;
        long max = 0;
        Integer count ;
        //大きいほうからk個選ぶ
        while(queue.size()<k){
            queue.add(td[idx]);
            sum+=td[idx].val;
            count = kind.get(td[idx].kind);
            if(count==null){
                kind.put(td[idx].kind,1);
            }else{
                kind.put(td[idx].kind,count+1);
            }
            idx++;
        }
        max = sum+(long)kind.size()*kind.size();
            
        Sushi tmp;
        //新しい種類の寿司が見つかったらポイントが小さいものからとっていく
        outer:for(int i=idx;i<n;i++){
            if(kind.containsKey(td[i].kind)){
                continue;
            }else{
                tmp = queue.peek();
                count = kind.get(tmp.kind);
                while(count==1){
                    queue.remove();
                    if(queue.size()==0)break outer;
                    tmp = queue.peek();
                    count = kind.get(tmp.kind);
                }
                queue.remove();
                kind.put(tmp.kind,count-1);
                kind.put(td[i].kind,1);
                queue.add(td[i]);
                sum = sum - tmp.val + td[i].val;
            }
            max = Math.max(max,sum+(long)kind.size()*kind.size());
        }
        System.out.println(max);
    }
}