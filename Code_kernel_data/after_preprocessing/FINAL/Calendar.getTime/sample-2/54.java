public class func{
public void incDecJour(Long date,int nbJour){
        cal = Calendar.getInstance();
        cal.setTimeInMillis(date);
        cal.add(Calendar.DAY_OF_MONTH, nbJour);
        return cal.getTime().getTime();
}
}
