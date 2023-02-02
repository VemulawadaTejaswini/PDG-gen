//23
public class func{
public void getInstance(){
    if(singleton == null)
    {
      singleton = new PageCacheHelper();
      new Thread(singleton).start();
    }
}
}
