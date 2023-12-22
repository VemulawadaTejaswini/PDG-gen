import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray(), t=sc.next().toCharArray();
        sc.close();
        int sl=s.length, tl=t.length;
        HashSet<Character> scaras=new HashSet<>();
        ArrayList<Integer> alph[]=new ArrayList[26];
        for(int a=0;a<26;a++) alph[a]=new ArrayList<>();
        for(int i=0;i<sl;i++){
            scaras.add(s[i]);
            alph[s[i]-'a'].add(i);
        }
        ArrayList<Integer> index[]=new ArrayList[tl];
        long ans=0;
        int now=-1;
        for(int j=0;j<tl;j++){
            if(!scaras.contains(t[j])){
                System.out.println(-1);
                return;
            }
            index[j]=alph[t[j]-'a'];
            int in=backBS(index[j], now);
            if(in==index[j].size()){
                ans+=sl;
                now=index[j].get(0);
            }
            else now=index[j].get(in);
        }
        ans+=now+1;
        System.out.println(ans);
    }
    public static int backBS(ArrayList<Integer> array, long key){
        int left=-1;
        int right=array.size();
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(array.get(mid)>key) right=mid;
            else left=mid;
        }
        return right;
    }
}