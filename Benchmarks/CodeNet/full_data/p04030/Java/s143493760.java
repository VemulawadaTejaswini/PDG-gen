import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String onEditor = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i < onEditor.length(); i++){
             char onScreen = onEditor.charAt(i);

             if(onScreen == 'B'){
                if(sb.length() > 0)
                 sb.replace(sb.length() - 1, sb.length(), "");
             }else{
                 sb.append(onScreen);
             }
        }

        System.out.println(sb.toString());
    }
}
