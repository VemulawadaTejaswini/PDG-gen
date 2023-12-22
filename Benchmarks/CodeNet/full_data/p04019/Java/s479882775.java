import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] direction = {"N","S","W","E"};
        boolean test = true;
        if(s.contains(direction[0])){
            if(!s.contains(direction[1])){
                test = false;
            }
        }
        if(s.contains(direction[1])){
            if(!s.contains(direction[0])){
                test = false;
            }
        }
        if(s.contains(direction[2])){
            if(!s.contains(direction[3])){
                test = false;
            }
        }
        if(s.contains(direction[3])){
            if(!s.contains(direction[2])){
                test = false;
            }
        }
        if(test){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
