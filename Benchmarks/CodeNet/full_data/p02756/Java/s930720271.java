import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
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
                            S = cmds[2].concat(S);
                        } else {
                            S = S.concat(cmds[2]);
                        }
                        break;
                    case "2":
                        // add tail
                        if(!flipped) {
                            S = S.concat(cmds[2]);
                        } else {
                            S = cmds[2].concat(S);
                        }
                        break;
                }
            }
        }
        if(!flipped) {
            System.out.println(S);
        } else {
            StringBuffer sb = new StringBuffer(S);
            System.out.println(sb.reverse().toString());
        }
    }
}