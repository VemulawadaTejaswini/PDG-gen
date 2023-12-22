import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        int count = sc.nextInt();
        boolean flag=true;
        List<Integer> data = new ArrayList<>();
        List<Integer> nullData= new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            data.add(sc.nextInt());
        }
        List<Integer> sorted = data.stream().collect(Collectors.toList());
        sorted.sort(Comparator.naturalOrder());
       
        int j=1;
        while (flag) {
            if(!sorted.isEmpty()){
                for (int i = 1; i <= j; i++) {
    //                System.out.println(sorted.indexOf(i));
                    if (sorted.indexOf(i)!=-1){
                        //System.out.println(sorted.get(sorted.indexOf(i)));
                        nullData.add(i-1, sorted.get(sorted.indexOf(i)));
                        sorted.remove(sorted.indexOf(i));
                        break;
                    }
                    if(i==j){
                        System.out.println("-1");
                        flag=false;
                        break;
                    }
                }
                j++;
            }else
                flag=false;
        }
        if(sorted.isEmpty()){
            for(Integer s:nullData)
                System.out.println(s);
        }
    }
}
