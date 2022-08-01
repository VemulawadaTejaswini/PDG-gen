//63
public class func{
	public void right(HttpServletRequest request,ModelMap model){
    Runtime runtime = Runtime.getRuntime();
    long freeMemoery = runtime.freeMemory();
    long totalMemory = runtime.totalMemory();
    long maxMemory = runtime.maxMemory();
    model.addAttribute("user", user);
    model.addAttribute("flowMap", cmsStatisticSvc.getWelcomeSiteFlowData(site.getId()));
}
}
