//12
public class func{
public void getNiceDate(String day,String month,String year,String localeString){
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        return df.format(cal.getTime());
}
}
