import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        char str[]=in.next().toCharArray();

        char dmc[]=new char[str.length];
        int dmcp[]=new int[str.length];

        int l=0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='D' || str[i]=='M' || str[i]=='C'){
                dmc[l]=str[i];
                dmcp[l]=i;
                l++;
            }
        }

        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int k=in.nextInt();
            int cnt=0;

            for(int d=0;d<l;d++){
                if(dmc[d]=='D'){
                    for(int m=d+1;m<l;m++){
                        if(dmc[m]=='M'){
                            for(int c=m+1;c<l;c++){
                                if(dmc[c]=='C' && dmcp[c]-dmcp[d]<k)cnt++;
                            }
                        }
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}