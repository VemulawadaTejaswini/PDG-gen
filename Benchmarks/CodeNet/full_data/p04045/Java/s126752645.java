import java.util.*;

public class Main {
    public static int ans[] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        String s = sc.next();
//        Long x = sc.nextLong();
        int ks[] = new int[k];
        int list[] = new int[10-k];
        ans = new int[String.valueOf(n).length()+1];
        String s;
        for(int i=0;i<k;i++){
            ks[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<10;i++){
            boolean f = true;
            for(int j=0;j<k;j++){
                if(ks[j]==i){
                    f=false;
                    break;
                }
            }
            if(f){
                list[count] = i;
                count++;
            }
        }

        for(int i=0;i<String.valueOf(n).length()+1;i++){
            ans[i]=0;
        }
        plus(ans.length-1,count);

        do{
            plus(ans.length-1,count);
            s = "";
            for(int i=0;i<String.valueOf(n).length()+1;i++){
                if(ans[i]!=0) {
                    s += list[ans[i] - 1];
                }
            }
        }while(Integer.valueOf(s)<n);
        System.out.println(s);
    }
    public static void plus(int n,int count){
        ans[n]++;
        if(ans[n]==count+1){
            ans[n]=1;
            plus(n-1,count);
        }
    }
}
