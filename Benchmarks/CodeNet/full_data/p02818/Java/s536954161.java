import java.util.*;

class Aoki{

    String num;
    public Aoki(String i){
        this.num = i;
    }

    public String aoki_num(){
        return String.valueOf(Long.parseLong(this.num)-1);
    }

    public String getNum(){
        return this.num;
    }

    public void setNum(String i){
        this.num = i;
    }
}

class Takahashi{

    String num;
    public Takahashi(String i){
        this.num = i;
    }

    public String takahashi_num(){
        return String.valueOf(Long.parseLong(this.num)-1);
    }

    public String getNum(){
        return this.num;
    }

    public void setNum(String renum){
        this.num = renum;
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] scan_str = scan.nextLine().split(" ");
        Takahashi takahashi = new Takahashi(scan_str[0]);
        Aoki aoki = new Aoki(scan_str[1]);
        for(long i = 0; i < Long.parseLong(scan_str[2]); i++){
            if(takahashi.getNum().equals("0")){
                if(aoki.getNum().equals("0")){
                    break;
                }else{
                    aoki.setNum(aoki.aoki_num());
                }
            }else{
                takahashi.setNum(takahashi.takahashi_num());
            }
        }

        System.out.println(takahashi.getNum() + " " + aoki.getNum());
    }
}