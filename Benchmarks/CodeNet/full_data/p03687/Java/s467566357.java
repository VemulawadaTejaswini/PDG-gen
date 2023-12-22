import java.util.*;

public class Main {
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] str=s.toCharArray();
        int[] stack=new int[26];
        int[] max=new int[26];
        for(int i=0;i<26;i++){
            stack[i]=-1;
            max[i]=-1;
        }
        for(int i=0;i<str.length;i++){
            if(i-stack[str[i]-'a']-1>max[str[i]-'a']){
                max[str[i]-'a']=i-stack[str[i]-'a']-1;
            }
            stack[str[i]-'a']=i;
        }
        for(int i=0;i<26;i++){
            if(str.length-stack[i]-1>max[i]){
                max[i]=str.length-stack[i]-1;
            }
        }
        int result=1000;
        
        for(int i=0;i<26;i++){
            if(max[i]>=0){
                if(result>max[i]){
                    result=max[i];
                }
            }
        }
        System.out.println(result);
    }
}
