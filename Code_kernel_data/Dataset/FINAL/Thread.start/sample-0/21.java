public class func{
public void newCis(String cisId){
        if(cpaMap.containsKey(cisId)) return;
        CPA newCPA = new CPA(collector,cisId);
        Thread t = new Thread(newCPA);
        t.start();
}
}
