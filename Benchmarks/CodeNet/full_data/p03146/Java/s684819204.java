import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>ClassName:Main</p>
 * <p>Description:</p>
 * <p>Company:www.shopin.net</p>
 *
 * @author zhangxinshui@shopin.cn
 * @version 1.0
 * @Date 2019/1/28  19:27
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0,n);
        if(n%2==0){
            list.add(n/2);

        }else {
            list.add(3*n+1);
        }
        for (int i = 1 ;i <list.size();i++){
            for (int j = 1;j<list.size();j++){
                if (list.get(i).equals(list.get(j))){
                    System.out.println(list.get(j)+1);
                    break;
                }
            }
        }
    }

}
