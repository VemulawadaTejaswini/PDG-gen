import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static class Schedule{
        int num;
        ArrayList<Integer> timeToNextStation, timeOfFirstTrain, freq;
        Schedule(int num){
            this.num = num;
            this.timeToNextStation = new ArrayList<Integer>(num);
            this.timeOfFirstTrain = new ArrayList<Integer>(num);
            this.freq = new ArrayList<Integer>(num);
        }

        void add(int c, int s, int f){
            this.timeToNextStation.add(c);
            this.timeOfFirstTrain.add(s);
            this.freq.add(f);
        }

        public int getTimeToNextStation(int i) {
            return timeToNextStation.get(i);
        }

        public int getTimeOfFirstTrain(int i) {
            return timeOfFirstTrain.get(i);
        }

        public int getFreq(int i) {
            return freq.get(i);
        }

        public int getNum() {
            return num;
        }

        int getTimeToFinalStation(int n){
            int count = 0;
            for(int i = n; i < this.num; i++){
                if(count > this.getTimeOfFirstTrain(i)) {
                    count += (this.getFreq(i) - count) % this.getFreq(i);
                    count += this.getTimeToNextStation(i);
                }else{
                    count = this.getTimeOfFirstTrain(i);
                    count += this.getTimeToNextStation(i);
                }
            }
            return count;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Schedule schedule = new Schedule(n-1);

        for(int i = 0; i < n-1; i++){
            int c = sc.nextInt();
            int s = sc.nextInt();
            int f = sc.nextInt();
            schedule.add(c, s, f);
        }

        for(int i = 0; i < schedule.getNum(); i++){
            System.out.println(schedule.getTimeToFinalStation(i));
        }

        System.out.println(0);
    }
}