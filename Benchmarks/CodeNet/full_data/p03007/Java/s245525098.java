import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        ArrayList<String> strings = new ArrayList<>();
        while (true){
            if(list.size()==1){
                break;
            }
            function(list,strings);
        }
        System.out.println(list.get(0));
        for (String string : strings) {
            System.out.println(string);
        }
    }
    static void function(List<Integer> list,List<String> strings){
        Collections.sort(list);
        int temp;
        if(list.size()==2){
            temp = list.get(1) - list.get(0);
            strings.add(list.get(1)+" "+list.get(0));


        }else {
             temp = list.get(0) - list.get(1);
            strings.add(list.get(0)+" "+list.get(1));

        }
        list.remove(1);
        list.remove(0);
        list.add(0,temp);
    }
}
