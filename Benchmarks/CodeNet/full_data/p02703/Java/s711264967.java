
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static long maxCoin;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long cityNum = scan.nextLong();
        long railNum = scan.nextLong();
        long OwnSCoin = scan.nextLong();

//        创建城市
        ArrayList<City> cities = new ArrayList<>();
        for (long i = 0; i < cityNum; i++) {
            cities.add(new City(i + 1));
        }

//        读入铁路
        long maxCoinRail = 0;
        for (long i = 0; i < railNum; i++) {
            int C1 = scan.nextInt() - 1;
            int C2 = scan.nextInt() - 1;
            long coin = scan.nextLong();
            long time = scan.nextLong();
            maxCoinRail = Math.max(maxCoinRail, coin);
            Rail rail12 = new Rail(cities.get(C1), cities.get(C2), coin, time);
            Rail rail21 = new Rail(cities.get(C2), cities.get(C1), coin, time);
            cities.get(C1).addRail(rail12);
            cities.get(C2).addRail(rail21);
        }

//        读入每个城市的换钱信息
        for (int i = 0; i < cityNum; i++) {
            long SCoin = scan.nextLong();
            long time = scan.nextLong();
            cities.get(i).steChange(SCoin, time);
        }

//        初始化
        maxCoin = maxCoinRail * (cityNum - 1);
        cities.get(0).minTime = 0;
        Record firstRecord=new Record(0,OwnSCoin);
        cities.get(0).addRecord(firstRecord);

//        遍历
        boolean done = false;
        while (!done) {
            done = true;
            for (City city : cities) {
                city.change();
                for (Record record : city.getNewRecords()) {
                    Route route = new Route(record, city);
                    route.goNext();
                    done = false;
                }
            }
        }

//        输出
        for (int i = 1; i < cities.size(); i++) {
            System.out.println(cities.get(i).getMinTime());
        }
    }
}

class City {
    private long id;

    public ArrayList<Rail> getRails() {
        return rails;
    }

    private final ArrayList<Rail> rails = new ArrayList<>();

    private long changeSCoin;

    private long changeTime;

    long minTime = 1000000000000000L;

    private final ArrayList<Record> records = new ArrayList<>();

    private ArrayList<Record> newRecords = new ArrayList<>();

    public long getMinTime() {
        return minTime;
    }

    public City(long id) {
        this.id = id;
    }

    public void addRail(Rail rail) {
        rails.add(rail);
    }

    public void steChange(long SCoin, long time) {
        changeSCoin = SCoin;
        changeTime = time;
    }

    public void addRecord(Record toAddRecord) {
        boolean toAdd = true;
        for (int i = 0; i < records.size(); i++) {
            int cmp = toAddRecord.compareTo(records.get(i));
            if (cmp == 1) {
                records.remove(i);
                i--;
            } else if (cmp == -1) {
                toAdd = false;
            }
        }
        if (toAdd) {
            records.add(toAddRecord);
            newRecords.add(toAddRecord);
            minTime = Math.min(minTime, toAddRecord.getCostTime());
        }
    }

    public void change() {
        ArrayList<Record> changed=new ArrayList<>();
        for (Record record:records){
            changed.add(record.next(changeTime,changeSCoin));
        }
        for (Record record:changed){
            addRecord(record);
        }
    }

    public ArrayList<Record> getNewRecords() {
        ArrayList<Record> ret = newRecords;
        newRecords = new ArrayList<Record>();
        return ret;
    }
}

class Rail {
    City start;
    City end;
    long costSCoin;
    long costTime;

    public Rail(City start, City end, long costSCoin, long costTime) {
        this.start = start;
        this.end = end;
        this.costSCoin = costSCoin;
        this.costTime = costTime;
    }
}

class Record {
    private final long costTime;
    private final long hasCoin;

    public long getCostTime() {
        return costTime;
    }

    public long getHasCoin() {
        return hasCoin;
    }

    public Record(long costTime, long hasCoin) {
        this.costTime = costTime;
        this.hasCoin = Math.min(hasCoin, Main.maxCoin);
    }

    /**
     * @param another 另一个需要比较的记录
     * @return 1表示更好，0表示无法比较，-1表示更差或等于
     */
    int compareTo(Record another) {
        int ret = 0;
        int cmpTime = Long.compare(this.costTime, another.costTime);
        int cmpCoin = Long.compare(this.hasCoin, another.hasCoin);
        if (cmpTime == 1) {
            if (cmpCoin == -1 || cmpCoin == 0) {
                ret = -1;
            }
        } else if (cmpTime == 0) {
            if (cmpCoin == 1) {
                ret = 1;
            } else {
                ret = -1;
            }
        } else {
//            cmpTime == -1
            if (cmpCoin == 1 || cmpCoin == 0) {
                ret = 1;
            }
        }
        return ret;
    }

    /**
     * @param addTime 增加的时间
     * @param addCoin 增加的银币
     * @return 返回一个新的Record记录
     */
    Record next(long addTime, long addCoin) {
        return new Record(this.costTime + addTime, this.hasCoin + addCoin);
    }
}

class Route {
    Record record;
    City cityNow;

    public Route(Record record, City cityNow) {
        this.record = record;
        this.cityNow = cityNow;
    }

    public void goNext() {
        for (Rail rail : cityNow.getRails()) {
            City cityNext = rail.end;
            long baseCoin = record.getHasCoin();
            long addCoin = -rail.costSCoin;
            long addTime = rail.costTime;
            if(baseCoin+addCoin>=0) {
                Record newRecord = new Record(record.getCostTime() + addTime, baseCoin + addCoin);
                cityNext.addRecord(newRecord);
            }
        }
    }
}