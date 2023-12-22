import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        String s=sc.next();
        sc.close();
        char[] c=s.toCharArray();
        ArrayList<Character> ans=new ArrayList<Character>();
        int left=0;
        int right=0;
        int index=0;
        for(int i=0;i<n;i++){
            ans.add(index, c[i]);
            if(c[i]=='('){
                if(left==right){
                    left++;
                }
                else if(left>right){
                    left++;
                }
            }
            else{
                if(left==right){
                    ans.add(0,'(');
                    index++;
                }
                else if(left>right){
                    right++;
                }
            }
            index++;
        }
        for(int i=0;i<left-right;i++) ans.add(')');
        for(int i=0;i<ans.size();i++) System.out.print(ans.get(i));
    }
}