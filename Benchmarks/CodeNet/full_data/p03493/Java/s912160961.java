import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
 
        int count = 0;
 
        for(char x: input.toCharArray()){
            if(x == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}