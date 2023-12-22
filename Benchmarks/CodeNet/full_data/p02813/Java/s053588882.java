import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0,temp2=0;
        for(int i=0;i<n;i++){
            temp+=sc.nextInt();
            if(i<n-1) temp*=10;
        }
        for(int i=0;i<n;i++){
            temp2+=sc.nextInt();
            if(i<n-1) temp2*=10;
        }
        int count=0;
        if(temp<=temp2){
            for(int i=temp+1;i<temp2;i++){
                if(contain(i,n)) count++;
            }
        }else{
            for(int i=temp2+1;i<temp;i++){
                if(contain(i,n)) count++;
            }
        }
        System.out.println(count+1);
    }

    static boolean contain(int k, int n){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=1;i<=n;i++) set.add(i);
        for(int i=0;i<n;i++){
            if(set.contains(k%10)) set.remove(k%10);
            else return false;
            k/=10;
        }
        return true;
    }
}