import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3]; //0番目→a 1番目→b 2番目→c
        str[0] = sc.next();
        str[1] = sc.next();
        str[2] = sc.next();
        int[] now = {0,0,0};
        int nowTurn = 0; //nowTurn→今自分のターンの人　0:A 1:B 2:C
        while (true){
            char key = str[nowTurn].charAt(now[nowTurn]);
            now[nowTurn]++;
            int nextTurn = (nowTurn + 1) % 3 ;
            if(str[nextTurn].length() > now[nextTurn]){
                if(str[nextTurn].charAt(now[nextTurn]) == key){
                    now[nextTurn]++;
                }
            }
            nextTurn = (nextTurn + 1) % 3;
            if(str[nextTurn].length() > now[nextTurn]){
                if(str[nextTurn].charAt(now[nextTurn]) == key){
                    now[nextTurn]++;
                }
            }
            nowTurn = key - 'a';
            if(now[nowTurn] == str[nowTurn].length()){
                break;
            }
        }
        switch(nowTurn){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
        
    }
    
}
