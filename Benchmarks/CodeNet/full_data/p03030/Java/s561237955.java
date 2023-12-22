import java.util.*;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        Restrant[] rest=new Restrant[n];
        Restrantrating rating=new Restrantrating();

        for(int i=0;i<n;i++)
		{   
			rest[i]=new Restrant(i+1,in.next(),in.nextInt());
        }
        
        Arrays.sort(rest,rating);

        for(int i=0;i<n;i++)
		{   
            System.out.println(rest[i].num);
        }
    }
    
}

class Restrant{
    int num;
    String city;
    int score;

    Restrant(int num,String city, int score){
        this.num=num;
        this.city=city;
        this.score=score;
    }
}

class Restrantrating implements Comparator<Restrant>{
    
    public int compare(Restrant a, Restrant b){
        if( !(a.city.equals(b.city)) ){
            return a.city.compareTo(b.city);
        }
        else return b.score-a.score;
    }

}

