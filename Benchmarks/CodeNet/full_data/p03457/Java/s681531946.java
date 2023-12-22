import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer inputNum = Integer.parseInt(scanner.nextLine());
        String output = "Yes";

        List<TimeAndXY> list = new ArrayList<>();
        list.add(new TimeAndXY(0,0,0));

        for(int i=0; i<inputNum; i++){
            final TimeAndXY nextState = new TimeAndXY(scanner.nextLine());
            list.add(nextState);

        }
        scanner.close();
        for(int i=0; i<inputNum; i++){
            TimeAndXY lastState = list.get(i);
            TimeAndXY nextState = list.get(i+1);
            if( nextState.canMoveFrom(lastState) ){
                lastState = nextState;
            }
            else{
                output = "No";
                break;
            }
        }
        System.out.println(output);
    }

    public static class TimeAndXY {
        private final int time;
        private final int x;
        private final int y;
        public TimeAndXY(String input){
            String[] inputs = input.split(" ");
            this.time = Integer.parseInt(inputs[0]);
            this.x = Integer.parseInt(inputs[1]);
            this.y = Integer.parseInt(inputs[2]);
        }
        @Override
        public String toString(){
            return "t="+time+", x="+x+", y="+y;
        }


        public TimeAndXY(int time, int x, int y){
            this.time = time;
            this.x = x;
            this.y = y;
        }
        public boolean canMoveFrom(TimeAndXY moveFrom){
            int xmove = this.x - moveFrom.x;
            int ymove = this.y - moveFrom.y;
            int duration = this.time - moveFrom.time;
            int xymove = Math.abs(xmove) + Math.abs(ymove);
            if( xymove<=duration ){
                if(xymove%2==duration%2){
                    return true;
                }
            }
            return false;
        }
    }
}
