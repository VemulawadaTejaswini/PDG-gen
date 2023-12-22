import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();

        System.out.println(search(H));
    }

    public long search(long H){
        if(H == 1L) return 1L;

        return 2*search(H/2L) + 1L;
    }
}
