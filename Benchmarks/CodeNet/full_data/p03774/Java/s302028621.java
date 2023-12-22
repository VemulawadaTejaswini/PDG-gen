import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int m=scan.nextInt();
        int st_x[]=new int[n];
        int st_y[]=new int[n];
        for(int i=0;i<n;i++){
            st_x[i]=scan.nextInt();
            st_y[i]=scan.nextInt();
        }

        int ch_x[]=new int[m];
        int ch_y[]=new int[m];
        for(int i=-0;i<m;i++){
            ch_x[i]=scan.nextInt();
            ch_y[i]=scan.nextInt();
        }
        int ans=m;
        int ans_dis;
        int dis;
        for(int i=0;i<n;i++){
            ans_dis=100000000;
            for(int j=0;j<m;j++){
                dis=Math.abs(st_x[i]-ch_x[j])+Math.abs(st_y[i]-ch_y[j]);
                if(ans_dis>dis){
                    ans_dis=dis;
                    ans=j+1;
                }
            }
            System.out.println(ans);
        }


    }
}