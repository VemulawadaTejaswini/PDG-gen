import java.io.IOException;

class NextAlphabet {
    public static void main(String[] args) throws IOException {
        char c = (char) System.in.read();
        int b=0;
        if( c>=97 && c<122){
            b = c + 1;
        }
        else {
            System.out.println("Not allowed");
        }
        c =(char)b;
        System.out.println(c);
    }
}