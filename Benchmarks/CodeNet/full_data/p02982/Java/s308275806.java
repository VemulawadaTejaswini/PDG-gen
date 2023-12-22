import java.util.*;
import java.io.*;

class Point{
    List<Integer> coordinates = new ArrayList<>();

    Point(List<Integer> list){
        this.coordinates=list;
    }
    
     double getDistance(Point another){
         double distance=0;
         for(int i=0;i<coordinates.size();i++){
             distance+=Math.pow((this.coordinates.get(i)-another.coordinates.get(i)),2);
         }
         distance=Math.sqrt(distance);
         return distance;
     }
}



public class Main{
    

    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            int ans=0;
            int n=sc.nextInt();
            int d=sc.nextInt();


            List<Point> allPoint = new ArrayList<>();
            for(int i=0;i<n;i++){
                List<Integer> list = new ArrayList<>();
                for(int j=0;j<d;j++){
                    list.add(sc.nextInt());
                }
                Point point= new Point(list);
                allPoint.add(point);
            }
            sc.close();
            
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    double dist=allPoint.get(i).getDistance(allPoint.get(j));
                    if(Math.floor(dist)==dist){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
    }
}
    