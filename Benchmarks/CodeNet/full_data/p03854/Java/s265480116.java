import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String a="dream";
        String b="dreamer";
        String c="erase";
        String d="eraser";
        int index=S.length();
        while(index>0){
            if(index>=5 && S.substring(index-5,index).equals(a)){
                index-=5;
            }else if(index>=7 && S.substring(index-7,index).equals(b)){
                index-=7;
            }else if(index>=5 && S.substring(index-5,index).equals(c)){
                index-=5;
            }else if(index>=6 && S.substring(index-6,index).equals(d)){
                index-=6;
            }else{
                System.out.println("No");
                break;
            }
        }
        if(index == 0){
            System.out.println("YES");
        }
    }
}