import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        String list = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> words = new ArrayList<String>();
        String s = sc.next();
        int ord = sc.nextInt();
        int k = 0;
        int total = 0;
        for(int j = 0; j < list.length(); j++){
            int now = 0;
            String tmp = s;
            int subs = 0;
            while(true){
                subs = tmp.indexOf(list.charAt(j));
                if(subs == -1){
                    break;
                }else{
                    for(int i = 1; i <= tmp.length() - subs; i++){ //s.length - j取れる文字数
                        String tmp2 = tmp.substring(subs, subs + i);
                        if(!words.contains(tmp2)){
                            words.add(tmp2);
                        }
                    }
                    now += s.length() - subs;
                    tmp = tmp.substring(subs + 1, tmp.length());
                }
            }
            if(words.size() >= ord){
                Collections.sort(words);
                System.out.println(words.get(ord - 1));
                return;
            }else{
                ord -= words.size();
                words.clear();
            }
        }
    }
}