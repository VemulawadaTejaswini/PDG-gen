import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> students = parse(N,sc);
        ArrayList<ArrayList<Integer>> checkpoints =  parse(M,sc);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(ArrayList<Integer> student : students){
           // result.add();
                    search(student, checkpoints);

        }
       // debugPrint(result);
    }

    private static int distance(ArrayList<Integer> a ,ArrayList<Integer> b ){
        int a_ = Math.abs(a.get(0) -  b.get(0) ) ;
        int b_ = Math.abs(a.get(1) -  b.get(1) );
        return a_ + b_ ;
    }

    private static ArrayList<Integer>  search(ArrayList<Integer> student,ArrayList<ArrayList<Integer>> checkpoints ){
        ArrayList<Integer> distances  =  new ArrayList<Integer>();

        for (ArrayList<Integer> checkpoint : checkpoints){
            distances.add(distance(checkpoint, student));
        }

        Integer minDistance = Collections.min(distances);

        int index = 0;
        for(int i=0  ; i < distances.size();i++ ){
            if(minDistance  == distances.get(i)){
                index = i;
                break;
            }
        }

        System.out.print( index +1);

        System.out.print('\n' );


        return checkpoints.get(index);
    }

    private static ArrayList<ArrayList<Integer>> parse(int rowNum,Scanner sc){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        IntStream.range(0,rowNum).forEach( n -> {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Integer>  row = new ArrayList<Integer>();
            row.add(x);
            row.add(y);
            result.add(row);
        });
        return result;
    }

    private static void debugPrint( ArrayList<ArrayList<Integer>> data ){
        for(ArrayList<Integer> row : data){
            for(Integer cell : row){
                System.out.print(cell);
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}


