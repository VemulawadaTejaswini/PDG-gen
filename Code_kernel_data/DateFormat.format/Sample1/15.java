//14
public class func{
	public void addParallelWorkflowEndDate(){
        endDate.sendKeys(sdf.format(new Date()));
        Assert.assertTrue(endDate.getAttribute("value").equals(sdf.format(new Date())));
}
}
