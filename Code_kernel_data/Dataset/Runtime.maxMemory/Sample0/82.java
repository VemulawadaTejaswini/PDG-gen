//81
public class func{
	public void printResources(PrintWriter response){
    response.append("Total Memory: " + (rt.totalMemory() >> 20) + "MB<br>\n");
    response.append("Used Memory: " + ((rt.totalMemory() - rt.freeMemory()) >> 20) + "MB<br>\n");
    response.append("Max Memory: " + (rt.maxMemory() >> 20) + "MB<br>\n");
}
}
