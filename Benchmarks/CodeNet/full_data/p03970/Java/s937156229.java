import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0;
        String q = "CODEFESTIVAL2016";
        String[] qa = q.split("");

        String str = scan.next();
        String[] stra = str.split("");

        for(int i = 0; i<qa.length; i++){
            if(qa[i].equals(stra[i])){

            }else{
                num++;
            }
        }
        System.out.println(num);
    }
}