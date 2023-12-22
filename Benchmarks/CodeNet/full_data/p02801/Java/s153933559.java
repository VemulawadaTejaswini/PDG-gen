
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]){
        String a=A0();
        System.out.println(v1(a.charAt(0)));

    }

    static char v1(char c){
        return ++c;
    }

    public static String A0(){

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}