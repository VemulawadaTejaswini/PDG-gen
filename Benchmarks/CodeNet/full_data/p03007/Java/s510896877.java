import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static class Pair{
        Long key;
        Long value;

        public Pair(Long a, Long b){
            key=a;
            value=b;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        long sumPos;
        long sumNeg;
        ArrayList<Pair> pair = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp >= 0) {
                pos.add(temp);
            } else {
                neg.add(temp);
            }
        }
            Collections.sort(pos);
            Collections.sort(neg);
            Collections.reverse(neg);
            sumPos = (neg.size()==0)? pos.get(0):neg.get(0);
            sumNeg=(pos.size()==0)?neg.get(0):pos.get(0);
            if(pos.size()>0) {
                for (int i = 1; i < pos.size() - 1; i++) {
                    pair.add(new Pair(sumPos, (long) pos.get(i)));
                    sumPos -= pos.get(i);
                }
                if (neg.size() == 0) {
                    pair.add(new Pair((long) pos.get(pos.size() - 1), sumPos));
                    sumPos = pos.get(pos.size() - 1) - sumPos;

                    System.out.println(sumPos);
                    for (Pair p : pair) {
                        System.out.println(p.key + " " + p.value);
                    }
                    return;
                }
            }
            if(neg.size()>0){
                for(int i=1; i<neg.size(); i++){
                    pair.add(new Pair(sumNeg, (long)neg.get(i)));
                    sumNeg-=neg.get(i);
                }
                if(pos.size()==0){
                    System.out.println(sumNeg);
                    for (Pair p : pair) {
                        System.out.println(p.key + " " + p.value);
                    }
                    return;
            }
            else {
                if(pos.size()>1){
                    pair.add(new Pair(sumPos, (long) pos.get(pos.size()-1)));
                    sumPos -= pos.get(pos.size()-1);
                }
                    
            }
                pair.add(new Pair(sumNeg,sumPos));
                System.out.println(sumNeg-sumPos);
                for(Pair p: pair){
                    System.out.println(p.key + " " + p.value);
                }
        }
    }
}