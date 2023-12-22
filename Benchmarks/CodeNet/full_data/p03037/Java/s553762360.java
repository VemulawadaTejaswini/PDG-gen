import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int cardNum = sc.nextInt();
        int gateNum = sc.nextInt();
        
        List<Integer> candidate = Range.list(sc.nextInt(), sc.nextInt());
        for(int i=1;i<gateNum;i++){
            List<Integer> line = Range.list(sc.nextInt(), sc.nextInt());
            for(int j=0;j<candidate.size();j++){
                if(!line.contains(candidate.get(j))){
                    candidate.remove(j);
                    j--;
                }
            }
            if(candidate.isEmpty()) break;
        }
        
        System.out.println(candidate.size());
        
    }
}

class Range{
    public static List<Integer> list(int start, int end){
        List<Integer> list = new ArrayList<>();
        for(int i=start;i<=end;i++){
            list.add(i);
        }
        return list;
    }
}
