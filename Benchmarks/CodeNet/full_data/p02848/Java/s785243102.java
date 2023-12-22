import java.util.*;

public class Main{
    public static void main(String args[])throws Exception{
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        String S = stdin.next();

        ArrayList<String> Sa = new ArrayList<>();

        for(int i= 0;i < S.length();i++){
            Sa.add(S.substring(i,i+1));
        }
        
        for(int i = 0;i < Sa.size();i++){
            int charValue = Sa.get(i).charAt(0);
            if(charValue+N > 90){
                int h = charValue-90;
                charValue = 65+h-1;
                String next1 = String.valueOf( (char) (charValue + N));
                Sa.set(i,next1);
            }
            else{
                String next = String.valueOf( (char) (charValue + N));
                Sa.set(i,next);
            }
        }
        for(int i=0;i < Sa.size();i++){
        System.out.printf("%s",Sa.get(i));
        }
    }
}