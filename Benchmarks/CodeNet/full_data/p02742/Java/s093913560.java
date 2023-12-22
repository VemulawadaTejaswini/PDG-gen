import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long masu1=sc.nextInt();
        long masu2=sc.nextInt();
       
        if(masu1!=1&&masu2!=1){
            long masu=masu1*masu2;
            System.out.print((long)Math.ceil(masu/2));
        }
        else{
            System.out.print(1);
        }
        sc.close();
    }
}