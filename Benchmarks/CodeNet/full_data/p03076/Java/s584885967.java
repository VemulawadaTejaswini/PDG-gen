import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int[] a= new int[5];
        for(int i=0;i<5;++i){
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        int r=0;
        for(int i=1;i<5;++i){
            if(a[i]%10<temp%10 && a[i]%10!=0){
                r+=temp-temp%10+10;
                temp=a[i];
            }else if(a[i]%10==0){
                r+=a[i]-a[i]%10;
            }else{
                r+=a[i]-a[i]%10+10;
            }
        }
        System.out.println(r+temp);
    }
}
