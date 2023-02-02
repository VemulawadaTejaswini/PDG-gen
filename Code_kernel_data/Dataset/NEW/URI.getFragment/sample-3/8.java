//8
public class func{
public void createWidgetBean(String sitemapName,Widget widget,boolean drillDown,URI uri,String widgetId){
      if(uri.getFragment() != null) {
        sb.append("#" + uri.getFragment());
      }
      sbBaseUrl.append(sb.toString());
      bean.url = sbBaseUrl.toString();
}
}
