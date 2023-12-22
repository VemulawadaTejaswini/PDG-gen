import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s[]=line.split(" ",0);
        int n[]=new int[2];
        for(int i=0;i<2;i++){
            n[i]=Integer.parseInt(s[i]);
        }
        long num[]=new long[n[0]];
        long num1[]=new long[n[0]];
        long num2[]=new long[n[0]];
        for(int i=0;i<n[0];i++){
            line=sc.nextLine();
            String s2[]=line.split(" ",0);
            num[i]=Long.parseLong(s2[0]);
            num1[i]=Long.parseLong(s2[1]);
            num2[i]=Long.parseLong(s2[2]);
        }
        long ans=0;
        for(int i=0;i<8;i++){
            long anan=0;
            long n1[]=num;
            long n2[]=num1;
            long n3[]=num2;
            if(i==4){
                for(int k=0;k<n[0];k++)
                n1[k]*=-1;
            }
            if(i==1||i==3||i==5||i==7){
                for(int k=0;k<n[0];k++)
                n2[k]*=-1;
            }
                for(int k=0;k<n[0];k++)
                n3[k]*=-1;
            long an[]=new long[n[0]];
for(int t=0;t<n[0];t++){
//System.out.println(n3[t]);
}
            for(int j=0;j<n[0];j++){
                an[j]=n1[j]+n2[j]+n3[j];
            }

            Arrays.sort(an);
            for(int j=0;j<n[1];j++){
                anan+=an[j];
            }
//System.out.println(anan);
            if(anan>ans){
                ans=anan;
            } if(-anan>ans){
                ans=-anan;
            }
        }
        System.out.println(ans);
    }
}
