//20
public class func{
	public void run(){
                    Calendar c = (Calendar) (startTimestamp.clone());
                    c.add(Calendar.MINUTE, i);
                    cappedTestCollection.insert(BasicDBObjectBuilder.start("increasing", c.getTime()).add("string", "value" + i).get(), WriteConcern.SAFE);
}
}
