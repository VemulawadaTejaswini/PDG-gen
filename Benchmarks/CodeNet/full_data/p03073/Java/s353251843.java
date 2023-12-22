import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String str = stdIn.next();

        char [] cs = str.toCharArray();

        int n = 0;

        int counter = 0;
        boolean flag = false;

        for(int i=0; i<cs.length; i++){
            if((cs[i] == '0' && !flag) || (cs[i] == '1' && flag)){

            }else{
                counter++;
            }
            flag = (flag) ? false : true;
        }

        n = counter;
        counter = 0;
        flag = true;

        for(int i=0; i<cs.length; i++){
            if((cs[i] == '0' && !flag) || (cs[i] == '1' && flag)){

            }else{
                counter++;
            }
            flag = (flag) ? false : true;
        }
      
      if(n>counter){
        n = counter;
      }

        System.out.println(n);
    }
}