import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int topNum = sc.nextInt();
        int pointNum = sc.nextInt();
        List<Integer> pointList = scanIntList(sc,pointNum);

        System.out.println(execute(topNum,pointNum,pointList));

    }

    public static long execute(int topNum, int pointNum, List<Integer> pointList) {
        pointList = pointList.stream().sorted((x, y) -> y - x).collect(Collectors.toList());

        if(topNum >= pointNum){
            return 0;
        }
        List<Integer> distanceList = new ArrayList<>();
        Long allDistance = 0L;
        for(int i = 1; i < pointList.size() ; i++){
            Integer distance = Math.abs(pointList.get(i-1) - pointList.get(i));
            distanceList.add(distance);
            allDistance += distance;
        }
        distanceList = distanceList.stream().sorted((x, y) -> y - x).collect(Collectors.toList());

        Long notMove = 0L;

        for(int i=0; i< topNum -1;i++){
            notMove += distanceList.get(i);
        }

        return allDistance - notMove;
    }

    public static List<Integer> scanIntList(Scanner sc,int num){
        List<Integer> scanList = new ArrayList<>();
        for(int i = 0; i < num; i++){
            scanList.add(sc.nextInt());
        }
        return scanList;
    }

}
