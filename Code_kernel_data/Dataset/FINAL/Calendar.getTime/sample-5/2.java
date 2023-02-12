public class func{
public void setDateHeader(HttpResponse response){
        Calendar time = new GregorianCalendar();
        response.headers().add(DATE, dateFormatter.format(time.getTime()));
}
}
