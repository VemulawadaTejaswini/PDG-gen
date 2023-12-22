import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> s=new ArrayList<>();
        int[] ary=new int[n];
        String[] str=new String[n];
        Arrays.fill(ary,0);
        int b=0;
        for(int i=0;i<n;i++){
            str[i]=sc.next();
            if(!s.contains(str[i])){
                s.add(str[i]);
                b++;
            }
        }
        int max=0;
        for(int i=0;i<b;i++){
            for(int j=0;j<n;j++){
                if(str[j].equals(s.get(i))){
                    ary[i]++;
                }
            }
            if(max<ary[i]){
                max=ary[i];
            }
        }
        for(int i=0;i<b;i++){
            if(ary[i]==max){
                System.out.println(s.get(i));
            }
        }
    }
}