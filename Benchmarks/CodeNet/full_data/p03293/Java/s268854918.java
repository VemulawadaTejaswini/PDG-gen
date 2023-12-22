import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String text =scn.next();
        String key = scn.next();
        text+=text;
        String answer = "No";
        for(int i=0; i<(text.length() - key.length()) ; i++){
            String buf = text.substring(i, i+key.length());
            if(buf.equals(key)){
                answer="Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}