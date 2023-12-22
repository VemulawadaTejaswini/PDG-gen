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
        int num[]=new int[n[0]];
        int num1[]=new int[n[0]];
        int num2[]=new int[n[0]];
        for(int i=0;i<n[0];i++){
            line=sc.nextLine();
            String s2[]=line.split(" ",0);
            num[i]=Integer.parseInt(s2[0]);
            num1[i]=Integer.parseInt(s2[1]);
            num2[i]=Integer.parseInt(s2[2]);
        }
        int ans=0;
        for(int i=0;i<8;i++){
            int anan=0;
            int n1[]=num;
            int n2[]=num1;
            int n3[]=num2;
            if(i>3){
                for(int k=0;k<n[0];k++)
                n1[k]=-num[k];
            }
            if(i==1||i==0||i==4||i==5){
                for(int k=0;k<n[0];k++)
                n2[k]=-num1[k];
            }
            if(i==0||i==2||i==4||i==6){
                for(int k=0;k<n[0];k++)
                n3[k]=-num2[k];
            }
            int an[]=new int[n[0]];
            for(int j=0;j<n[0];j++){
                an[j]=n1[j]+n2[j]+n3[j];
            }
            Arrays.sort(an);
            for(int j=0;j<n[1];j++){
                anan+=an[j];
            }
            if(anan>ans){
                ans=anan;
            } if(-anan>ans){
                ans=-anan;
            }
        }
        System.out.println(ans);
    }
}
