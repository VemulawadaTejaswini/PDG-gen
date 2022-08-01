//27
public class func{
	public void addDateDoc(String content,int year,int month,int day,int hour,int minute,int second,IndexWriter iw){
    Calendar cal = Calendar.getInstance(Locale.ROOT);
    cal.set(year, month - 1, day, hour, minute, second);
    d.add(new Field("date", getDate(cal.getTime(), DateTools.Resolution.DAY),
        StringField.TYPE_NOT_STORED));
    iw.addDocument(d);
}
}
