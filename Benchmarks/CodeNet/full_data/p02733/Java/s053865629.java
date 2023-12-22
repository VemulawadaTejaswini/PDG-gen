import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int k=sc.nextInt();
        boolean[][] nums=new boolean[h][w];
        String tmp;
        for(int i=0;i<h;i++){
            tmp=sc.next();
            for(int j=0;j<w;j++){
                nums[i][j]=tmp.charAt(j)=='1';
                //ホワイトチョコが1
            }
        }
        int[][] sum=new int[h][w+1];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                sum[i][j+1]=sum[i][j]+(nums[i][j]?1:0);
            }
        }
        int bit=0;
        int count;
        int ans;
        int finalans=Integer.MAX_VALUE;
        int finalcut;
        int finalcuttmp;
        while(bit<Math.pow(2, h-1)){
            finalcut=0;
            finalcuttmp=0;
            ans=0;
            for(int i=0;i<h-1;i++){
                if((bit&(int)Math.pow(2, i))>0){
                    ans++;
                }
            }
            for(int i=0;i<w;i++){
                count=0;
                for(int j=0;j<h;j++){
                    count+=sum[j][i+1]-sum[j][finalcuttmp];
                    if(count>k){
                        finalcut=i;
                        ans++;
                    }
                    if((bit&(int)Math.pow(2, j))>0){
                        count=0;
                    }
                }
                finalcuttmp=finalcut;
            }
            finalans=Math.min(ans, finalans);
            bit++;
        }
        System.out.println(finalans);

    }

}