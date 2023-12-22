import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        byte a = yomi.nextByte();
        byte b = yomi.nextByte();
        int kai=0;
        for (byte i=0;i<2;i++){
            if (a>b){
                kai=kai+a;
                a--;
            }else {
                kai = kai + b;
                b--;

            }
        }
        System.out.println(kai);

        }

    }