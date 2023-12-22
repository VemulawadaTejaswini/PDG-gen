import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        double[] a=new double[200000];

        for(int i=0;i<N;i++)
        {
            a[i]=scan.nextInt();
        }

        double x=a[0];
        double y=a[N-1];
        double diffe=Math.abs(x-y);

        int i=0;
        int j=N-1;

        if(N==2){
            System.out.println((int)diffe);
        }else{
            if(N%2==0){
                for(int n=1;n<N/2;n++) x+=a[n];
                for(int m=N/2;m<N-1;m++) y+=a[m];
                diffe=Math.abs(x-y);

                int s=N/2;

                while(true){
                    if(Math.abs((x+a[s])-(y-a[s]))<diffe && Math.abs((x-a[s-1])-(y+a[s-1]))>diffe){
                        //System.out.println(1-2);
                        x+=a[s];
                        y-=a[s];
                        s++;
                    }else if(Math.abs((x+a[s])-(y-a[s]))>diffe && Math.abs((x-a[s-1])-(y+a[s-1]))<diffe){
                        //System.out.println(1-1);
                        x-=a[s-1];
                        y+=a[s-1];
                        s--;
                    }else if(Math.abs((x+a[s])-(y-a[s]))>=diffe && Math.abs((x-a[s-1])-(y+a[s-1]))>=diffe){
                        System.out.println((int)Math.abs(x-y));
                        break;
                    }
                }
            }else{
                for(int n=1;n<=(N-1)/2;n++) x+=a[n];
                for(int m=(N+1)/2;m<N-1;m++) y+=a[m];
                diffe=Math.abs(x-y);
                int l=(N-1)/2;
                //System.out.println(Math.abs((x+a[l+1])-(y-a[l+1])));
                //System.out.println(Math.abs((x-a[l])-(y+a[l])));
                while(true){
                    if(Math.abs((x+a[l+1])-(y-a[l+1]))<diffe && Math.abs((x-a[l])-(y+a[l]))>diffe){
                        //System.out.println(2);
                        x+=a[l+1];
                        y-=a[l+1];
                        l++;
                    }else if(Math.abs((x+a[l+1])-(y-a[l+1]))>diffe && Math.abs((x-a[l])-(y+a[l]))<diffe){
                        //System.out.println(1);
                        x-=a[l];
                        y+=a[l];
                        l--;
                    }else if(Math.abs((x+a[l+1])-(y-a[l+1]))>=diffe && Math.abs((x-a[l])-(y+a[l]))>=diffe){
                        System.out.println((int)Math.abs(x-y));
                        break;
                    }
                }
            }


        }
    }
}
