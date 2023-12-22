import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Comparable {
 
    private String rest_name;
    private int rest_score;
    private int rest_no;
 
    public Main(String rest_name, int rest_score, int rest_no) {
        this.rest_name = rest_name;
        this.rest_score = rest_score;
        this.rest_no = rest_no;
    }
 
    public int compareTo(Object arg_obj) {
        Main obj = (Main)arg_obj;
        int str_comp = this.rest_name.compareTo(obj.rest_name);
        if (str_comp == 0) {
            if (this.rest_score < obj.rest_score) {
                return 1;
            } else if (this.rest_score > obj.rest_score) {
                return -1;
            } else {
                return 0;
            }
        }
        return str_comp;
    }
 
    public static void main(String[] args) {
        int rest_num = new Scanner(System.in).nextInt();
 
        Main obj;
        String line;
        ArrayList<Main> rest_list = new ArrayList<Main>();
        for (int i = 0; i < rest_num; i++) {
            line = new Scanner(System.in).nextLine();
            obj = new Main(line.split(" ")[0], Integer.parseInt(line.split(" ")[1]), i + 1);
            rest_list.add(obj);
        }
        Collections.sort(rest_list);
        for (Main item : rest_list) {
            System.out.println(item.rest_no);
        }
    }
}