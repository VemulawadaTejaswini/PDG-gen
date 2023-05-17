public class func{
public void dropDerby2041Triggers(Statement s){
        for (int i = 1; i <= 5; i++) {
            s.execute("drop trigger d2041_tr" + i);
        }
}
}
