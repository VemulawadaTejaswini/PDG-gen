import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<String>();
        while (sn.hasNextLine()) {
            String str = sn.nextLine();
            li.add(str);
        }
        String[] array = li.toArray(new String[li.size()]);
        String[] moji = array[1].split("");
        String told = array[1];
        int mojime = new Integer(array[2]).intValue();
        String t = told.substring(mojime+1,mojime+1);
        int mojisu = new Integer(array[0]).intValue();
        for(int i=0;i<mojisu;i++){
            if(moji[i]==t){
            }
            else if(moji[i]!=t){
                moji[i]="*";
            }
        }
        System.out.println(moji);
    }
}
