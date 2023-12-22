import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        String ss = sc.next();
        for (int i=0;i<4;i++){
            num[i]=ss.charAt(i)-'0';
        }
        boolean b = true;
        for (int i=0;i<8&&b;i++){
            int ans = num[0];
            int[] integer = {i/4,(i%4)/2,i%2};
            for (int j=0;j<3;j++){
                if (integer[j]==0) ans+=num[j+1];
                else ans-=num[j+1];
            }
            char[] c = new char[3];
            for (int j=0;j<3;j++){
                if (integer[j]==0)c[j]='+';
                else c[j]='-';
            }
            if (ans==7){
                b=false;
                System.out.println(""+num[0]+c[0]+num[1]+c[1]+num[2]+c[2]+num[3]+"=7");
            }
        }
    }
}
