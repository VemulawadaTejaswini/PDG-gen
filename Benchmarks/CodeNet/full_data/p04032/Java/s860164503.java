import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] res = helper(s);
        String ans = Integer.toString(res[0])+" "+Integer.toString(res[1]);
        System.out.print(ans);
    }
    static int[] helper(String s){
        int len = s.length();
        for(int i=0;i<26;i++){
            char cur = (char)(i+'a');
            int left=0;
            while(left<len-1){
                if(s.charAt(left)!=cur){
                    left++;
                    continue;
                }
                int right=left+1;
                if(s.charAt(right)==cur) return new int[]{left+1,right+1};
                right++;
                if(right<len&&s.charAt(right)==cur) return new int[]{left+1,right+1};
                left=right;
            }
        }
        return new int[]{-1,-1};
    }
}
