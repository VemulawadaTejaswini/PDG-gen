import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        if(Reverse(Delete(Str)) != 0){
            System.out.println(-1);
            return;
        } 
        else if(Delete(Str).length() == Str.length()){
            System.out.println(0);
            return;            
        }
        else System.out.println(insertX(Str));
    }
    private static int Reverse(String string){
        String reverse = new StringBuffer(string).reverse().toString();
        int result = string.compareTo(reverse);
        return result;
    }
    private static String Delete(String string){
        String deleted = "";
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != 'x'){
                deleted +=string.charAt(i);
            }
        }
        return deleted;
    }
    private static int insertX(String string){
        int start = 0;
        int end = string.length() - 1;
        int countx = 0;
        while(start < end){
            if(string.charAt(start) != string.charAt(end)){
                countx ++;
                if(string.charAt(start) == 'x') end ++;
                else start --;
            }
            start ++;
            end --;
        }
        return countx;
    }
}