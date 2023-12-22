import java.util.*;

class number{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int top = a/100;
        int bottom = a%10;
      　String result = "";
        if(top == bottom){
            result = "Yes"; 
        }else{
            result = "No";
        }
      System.out.println(result);
    }
}