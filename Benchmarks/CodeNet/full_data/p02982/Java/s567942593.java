import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int d=scn.nextInt();
        int[][] dot=new int[n][d];
        int answer=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<d;j++){
                dot[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double check=0;
                for(int k=0;k<d;k++){
                    check+=(dot[i][k]-dot[j][k])*(dot[i][k]-dot[j][k]);
                }
                check=Math.sqrt(check);
                if(check==(int)check){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
