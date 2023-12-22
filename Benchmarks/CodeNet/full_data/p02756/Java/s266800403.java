import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder builder = new StringBuilder(s);
        int q = scanner.nextInt();

        boolean asc = true;
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
//                builder = builder.reverse();
                asc = !asc;
            } else if (query == 2) {
                int f = scanner.nextInt();
                String c = scanner.next();

                if (f == 1) {
                    if(asc) {
                        builder.insert(0, c);
                    }else{
                        builder.append(c);
                    }
                } else {
                    if(asc) {
                        builder.append(c);
                    }else{
                        builder.insert(0, c);
                    }
                }
            }
        }
        if(!asc){
            builder = builder.reverse();
        }
        System.out.println(builder.toString());
    }
}