import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int L =scn.nextInt();
        int R =scn.nextInt();
        if(R-L>=2019) R=L+2019;
        int min=2019;
        for(int i=L;i<R;i++){
            for(int j=i+1;j<=R;j++){
                int buf=(i*j)%2019;
                if(buf<min) min=buf;
            }
        }
        System.out.println(min);
    }
}
