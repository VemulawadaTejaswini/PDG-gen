import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        String[] h=new String[10000];
        
        for(int i=0;i<10000;i++){
            if(i<5000){
                h[i]=".";
            }else{
                h[i]="#";
            }
        }
        
        int gyo=(B-1)/50+1;
        int las=(B-1)%50;
        
        for(int i=0;i<gyo-1;i++){
            for(int j=0;j<50;j++){
                h[200*i+2*j]="#";
            }
        }
        for(int j=0;j<las;j++){
            h[200*(gyo-1)+2*j]="#";
        }
        
        gyo=(A-1)/50+1;
        las=(A-1)%50;
        
        for(int i=0;i<gyo-1;i++){
            for(int j=0;j<50;j++){
                h[200*(i+26)+2*j]=".";
            }
        }
        for(int j=0;j<las;j++){
            h[200*(gyo-1+26)+2*j]=".";
        }
        System.out.println("100 100");
        for(int i=0;i<10000;i++){
            if(i%100==99){
                System.out.println(h[i]);
            }else{
                System.out.print(h[i]);
            }
        }
    }
}
