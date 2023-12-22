import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuffer sb = new StringBuffer(S);
        int Q = sc.nextInt();
        boolean flipped = false;
        sc.nextLine();  // discard
        for(int i=0; i<Q; i++) {
            String cmd = sc.nextLine();
            String cmds[] = cmd.split(" ", -1);
            if(cmds[0].equals("1")) {
                // filp
                flipped = !flipped;
            } else {
                // add
                switch(cmds[1]) {
                    case "1":
                        // add head
                        if(!flipped) {
                            sb.insert(0, cmds[2]);
                        } else {
                            sb.append(cmds[2]);
                        }
                        break;
                    case "2":
                        // add tail
                        if(!flipped) {
                            sb.append(cmds[2]);
                        } else {
                            sb.insert(0, cmds[2]);
                        }
                        break;
                }
            }
        }
        if(!flipped) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}