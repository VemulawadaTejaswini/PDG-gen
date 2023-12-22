import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long masu1=sc.nextInt();
        long masu2=sc.nextInt();
        long masu=masu1*masu2;
        if(masu1*masu2==1)System.out.print(1);
        else{
        if(masu%2!=0)masu++;
        System.out.print(masu/2);
        }
        sc.close();
    }
}