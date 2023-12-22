import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        if(N==2){
            System.out.println(Math.abs(s[0] - s[1]));
            return;
        }
        if(N==3){
            int[] ans = new int[2];
            ans[0]=Math.abs(s[0]-s[1]);
            ans[1]=Math.abs(s[1]-s[2]);
            System.out.println(Math.abs(ans[0]-ans[1]));
            return;
        }
        int[] ans = new int[N-1];
        for(int i=0;i<N-1;i++){
            ans[i] = Math.abs(s[i]-s[i+1]);
        }
        List<ZIP> zl = new ArrayList<>();
        for(int i=0;i<N-2;i++){
            ans[i] = Math.abs(ans[i]-ans[i+1]);
            if(zl.size() == 0 || (zl.get(zl.size()-1).num != ans[i])){
                zl.add(new ZIP(ans[i], 1));
            }else{
                zl.get(zl.size()-1).addCnt();
            }
        }
        for(int i=0;i<N-3;i++){
            List<ZIP> nxt = new ArrayList<>();
            for(int j=0;j<zl.size();j++){
                if(zl.get(j).cnt > 1){
                    ZIP n = zl.get(j);
                    n.minusCnt();
                    n.num = 0;
                    nxt.add(n);
                }
                if(j < zl.size()-1){
                    int newNum = Math.abs(zl.get(j).num - zl.get(j+1).num);
                    nxt.add(new ZIP(newNum, 1));
                }
            }
            zl = nxt;
        }
        System.out.println(zl.get(0).num);
    }
    private static class ZIP{
        public int cnt;
        public int num;
        ZIP(int num, int cnt){
            this.cnt = cnt;
            this.num = num;
        }
        public void addCnt(){
            cnt++;
        }
        public void minusCnt(){
            cnt--;
        }
        @Override
        public String toString(){
            return num +"-"+cnt;
        }
    }
}
