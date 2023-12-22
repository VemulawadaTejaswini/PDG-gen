import java.util.*;

class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i = 0;
    if(s.equals("SUN")){
        i=7;
    }else if(s.equals("SAT")){
        i=1;
    }else if(s.equals("FRI")){
        i=2;
    }else if(s.equals("THU")){
        i=3;
    }else if(s.equals("WED")){
        i=4;
    }else if(s.equals("TUE")){
        i=5;
    }else if(s.equals("MON")){
        i=6;
    }
    System.out.println(i);


    }
}