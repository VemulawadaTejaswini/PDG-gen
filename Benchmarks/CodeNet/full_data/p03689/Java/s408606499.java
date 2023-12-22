import java.util.*;

public class Main {
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int h=sc.nextInt();
        int w=sc.nextInt();
        int nH=H/(2*h-1);
        if(H%(2*h-1)!=0){
            nH++;
        }
        int nW=W/(2*w-1);
        if(W%(2*w-1)!=0){
            nW++;
        }
        if(H*W-nH*nW-w*h*nH*nW>0){
            System.out.println("Yes");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    if(((j+w)%(2*w-1))==0&&(i+h)%(2*h-1)==0){
                        sb.append(String.valueOf(-1*w*h));
                    }else{
                        sb.append("1");
                    }
                    sb.append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }else{
            System.out.println("No");

        }
    }
}
