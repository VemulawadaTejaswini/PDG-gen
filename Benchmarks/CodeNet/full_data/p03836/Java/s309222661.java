import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int sx=sc.nextInt(),sy=sc.nextInt(),tx=sc.nextInt(),ty=sc.nextInt();
        StringBuffer ax=new StringBuffer(),ay=new StringBuffer(),bx=new StringBuffer(),by=new StringBuffer();
        for(int i=0;i<Math.abs(sy-ty);i++){
            if(ty-sy>0){
                ay.append("U");
                by.append("D");
            }
            else{
                ay.append("D");
                by.append("U");
            }
        }
        for(int i=0;i<Math.abs(sx-tx);i++){
            if(tx-sy>0){
                ax.append("R");
                bx.append("L");
            }
            else{
                ax.append("L");
                bx.append("R");
            }
        }
        System.out.print(ax);
        System.out.print(ay);
        System.out.print(bx);
        System.out.print(by);
        if(ty-sy>0){
            ay.append("U");
            by.append("D");
        }
        else{
            ay.append("D");
            by.append("U");
        }
        if(tx-sy>0){
            ax.append("R");
            bx.append("L");
        }
        else{
            ax.append("L");
            bx.append("R");
        }
        System.out.print(ty-sy>0?"D":"U");
        System.out.print(ax);
        System.out.print(ty-sy<0?"D":"U");
        System.out.print(ay);
        System.out.print(bx);
        System.out.print(tx-sx>0?"L":"R");
        System.out.print(by);
        System.out.print(tx-sx<0?"L":"R");
    }
}
