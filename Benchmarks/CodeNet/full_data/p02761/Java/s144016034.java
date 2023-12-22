import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] ps=new int[m],ch=new int[m];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int ffs=0;
        for(int i=0;i<m;i++){
            ps[i]=scanner.nextInt();
            ch[i]=scanner.nextInt();
            if(hashMap.get(ps[i])!=null && hashMap.get(ps[i])!=ch[i]){
                ffs=1;
            }
            hashMap.put(ps[i],ch[i]);

        }
        if(m==0){
            StringBuilder  stringBuilder=new StringBuilder();
//        for(int j=0;j<n;j++){
//                if(j==0){
//                    stringBuilder.append(1);
//                }
//                else{
//                    stringBuilder.append(0);
//                }
//            }
//            stringBuilder.append(-1);
            if(n==1){
                System.out.println(0);
            }
            else{
                for(int j=0;j<n;j++){
                if(j==0){
                    stringBuilder.append(1);
                }
                else{
                    stringBuilder.append(0);
                }
            }
                System.out.println(stringBuilder.toString());
               // System.out.println(-1);
            }
//            System.out.println(-1);

        }
        else if(ffs==1){
            System.out.println(-1);
        }
        else{
            if(n>1 && hashMap.get(1)!=null &&  hashMap.get(1)==0){
                System.out.println(-1);
            }
            else{
                int[] str=new int[n];
                for(int j=0;j<n;j++){
                    for(int i=0;i<m;i++){
                        if(ps[i]-1==j){
                            str[j]=ch[i];
                           // System.out.println(j+ " "+ch[i]);
                            break;
                        }
                    }
                }
                StringBuilder stringBuilder=new StringBuilder();
                for(int j=0;j<n;j++){
                    if(j==0 && str[j]==0 && n>1){
//                      ffs=1;
                        stringBuilder.append(1);
                        continue;
                    }
                    stringBuilder.append(str[j]);
                }
//                if(ffs==1){
//                    System.out.println(-1);
//                }
//                else
                    {
                    System.out.println(stringBuilder.toString());
                }}
        }
    }
}
