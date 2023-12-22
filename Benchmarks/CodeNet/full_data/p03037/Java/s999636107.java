import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int flg=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            l[i-1] = sc.nextInt();
            r[i-1] = sc.nextInt();
            for(int j=0;j<m;j++){

                if(i>=l[j]&&i<=r[j]){
                }else{
                    flg=1;
                    break;
                }
            }
            if(flg==0){
                sum++;
            }else{
                flg=0;
            }
        }
        System.out.println(sum);
    }
}