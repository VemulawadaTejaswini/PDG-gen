import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TrieNode root = new TrieNode();
        int N = sc.nextInt();
        long P = sc.nextLong();
        String S = sc.next();
        //printAllDivisible(S, P);
        long sum = 0;
        boolean[] visited = new boolean[S.length()+1];
        Arrays.fill(visited, false);
        //System.out.println(getSum(S,root, 11, visited));
        for(int i=0;i<S.length();i++){
            if(visited[i]){continue;}
            sum += getSum(S, root, i, visited, P);
        }
        System.out.println(sum);
    }

    private static void printAllDivisible(String S, long P){
        for(int i=0;i<20;i++){
            for(int j=i+1;j<=20;j++){
                if(j-i <= 18){
                    if(Long.decode(S.substring(i,j)) % P == 0){
                        System.out.println(S.substring(i,j));
                    }
                }
            }
        }
    }

    private static long getSum(String S, TrieNode root, int start, boolean[] visited, long P){
        int now = start;
        long renzoku=0;
        long sum = 0;
        while(now < S.length()){
            int next = root.getWordEnd(S, now, P);
            visited[now] = true;
            if(next == -1){
                sum += renzoku * (renzoku+1) / 2;
                //System.out.println("from " + start + ":" + sum);
                return sum;
            }else{
                renzoku++;
                now = next;
            }
        }
        sum += renzoku * (renzoku+1) / 2;
        //System.out.println("from " + start + ":" + sum);
        return sum;
    }

    private static String toStrFromLong(long val){
        if(val == 0){return "0";}
        String r = new Long(val).toString();
        return r;
    }

    private static class TrieNode{
        TrieNode[] ch = new TrieNode[10];
        boolean isWord = false;
        TrieNode(){
        }

        void setWord(String S){
            if(S.length() == 0){
                isWord = true;
                return;
            }
            int num = S.charAt(0) - '0';
            if(ch[num] == null){
                ch[num] = new TrieNode();
            }
            ch[num].setWord(S.substring(1));
        }

        int getWordEnd(String S, int from, long P){
            long val = S.charAt(from)-'0';
            int ind = from+1;
            while(val % P != 0 && ind < S.length()){
                val -= (val/P)*P;
                val *= 10;
                val += (S.charAt(ind)-'0');
                ind++;
            }
            if(val % P == 0){
                return ind;
            }else{
                return -1;
            }
        }
    }
}
