import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String nyu = sc.next();
        int cnt = 0 , mem = 0 , leng;
        leng = nyu.length();
        for(int i=0 ; i < leng ; i++){
            char top = nyu.charAt(i);
            switch(top){
                case 'A':
                    cnt += 1;
                    break;
                case 'C':
                    cnt += 1;
                    break;
                case 'G':
                    cnt += 1;
                    break;
                case 'T':
                    cnt += 1;
                    break;
                default :
                    if(cnt > mem){
                        mem = cnt;
                        cnt = 0;
                    }
            }
        }
      if(cnt > mem){
            mem = cnt;
        }
        System.out.println(mem);
    }
    
}