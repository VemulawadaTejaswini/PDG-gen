import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String text = sc.next();

        int[] work = new int[text.length()];
        int tmp = 0;
        int[] ext = new int[1000];
        for(int i = 0; i < text.length(); i++){
            String str = String.valueOf(text.charAt(i));
            work[i] = Integer.valueOf(str);
        }

        for(int d100 = 0;d100 <= 9; d100++) {
            for(int i = 0; i < text.length() - 2; i++){
                if(d100 == work[i]) {
                    for(int d10 = 0;d10 <= 9; d10++) {
                        for(int j = i+1; j < text.length() - 1; j++){
                            if(d10 == work[j]) {
                                for(int d1 = 0;d1 <= 9; d1++) {
                                    for(int k = j+1; k < text.length(); k++){
                                        int d = d100*100+d10*10+d1;
                                        if(ext[d] != 0) {
                                            continue;
                                        }
                                        if(d1 == work[k]) {
                                            tmp++;
                                            ext[d] = 1;
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(tmp);
    }
}
