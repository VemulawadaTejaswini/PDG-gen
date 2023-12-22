import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MAX = 100000+24;
    private static int[][] knift=new int[MAX][2];
    private static int[] temp=new int[MAX*2];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            int n=in.nextInt(),h=in.nextInt(),idx=0,Size=0;
            for(int i=0;i<n;i++){
                knift[i][0]=in.nextInt();
                knift[i][1]=in.nextInt();
                if((knift[i][0]>knift[idx][0])||(knift[i][0]==knift[idx][0] && knift[i][1]<knift[idx][1])){
                    idx=i;
                }
            }
            for(int i=0;i<n;i++){
                if(idx==i){
                    continue;
                }
                temp[Size++]=Math.max(knift[i][0],knift[i][1]);
            }
            Arrays.sort(temp,0,Size);
            int answer=0;
            for(int i=Size-1;i>=0&&h>0;i--){
                if(temp[i]<=knift[idx][0]){
                    break;
                }
                h-=temp[i];
                answer++;
            }
            if(knift[idx][1]>knift[idx][0]&&h>0){
                answer++;
                h-=knift[idx][1];
            }
            if(h>0){
                answer+=(int)Math.ceil(((double)h)/knift[idx][0]);
            }
            out.println(answer);
            out.flush();
        }
        in.close();
        out.close();
    }

}
