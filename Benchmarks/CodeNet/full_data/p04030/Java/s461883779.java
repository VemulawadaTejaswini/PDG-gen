import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inArray = input.split("");
        String[] outArray = new String[inArray.length];
        int count = 0;
        int inArraycount = 0;
        String currentStr = "";
        int precount = 0;
        while(count < inArray.length){
            currentStr = inArray[inArraycount];
            if(count == 0){
               precount = 0;
            }else{
                precount = count-1;
            }
            if(currentStr.equals("B")){
                outArray[precount] = "";//一個前の文字を空に
            }else {
                outArray[count] = currentStr;
            }
            count++;
            inArraycount++;
        }
        
        //output
        for(int i = 0; i < outArray.length; i++){
            if(outArray[i]==null){
                 System.out.print("");
            }else{
                System.out.print(outArray[i]);      
            }
            
        }
    }
}