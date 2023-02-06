//11
public class func{
public void deleteBatch(Integer category,Integer siteId,Integer days){
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DAY_OF_MONTH, -days);
      date = cal.getTime();
    return dao.deleteBatch(category, siteId, date);
}
}
