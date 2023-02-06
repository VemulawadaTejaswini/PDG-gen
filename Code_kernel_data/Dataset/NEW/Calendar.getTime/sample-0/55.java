//55
public class func{
public void getPageForSitemap(Date lastModifiedDate){
    if(lastModifiedDate == null){
      java.util.Calendar cal = Calendar.getInstance();
      cal.set(1970, 0, 1);
      lastModifiedDate = cal.getTime();
    }
    return pageDAO.getPageForSitemap(lastModifiedDate, 0, 0);
}
}
