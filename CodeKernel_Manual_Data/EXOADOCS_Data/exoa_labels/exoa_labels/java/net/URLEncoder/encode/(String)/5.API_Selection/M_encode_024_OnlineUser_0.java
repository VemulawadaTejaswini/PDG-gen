public class A{
	public String getInfoString(){
		return(new String(java.net.URLEncoder.encode("ip=" + (ip!=null ? ip : "0.0.0.0")) + " " +java.net.URLEncoder.encode("connect=" + starting) + " " +java.net.URLEncoder.encode("state=" + state) + " " +java.net.URLEncoder.encode("nickname=" + (nickname!=null ? nickname : "")) + " " +java.net.URLEncoder.encode("name=" + (name!=null ? name : "")) + " " +java.net.URLEncoder.encode("community=" + (community!=null ? community : "")) + " " +java.net.URLEncoder.encode("area=" + (area!=null ? area : "")) + " " +java.net.URLEncoder.encode("page=" + (page!=null ? page : "")) + " " +java.net.URLEncoder.encode("url=" + (url!=null ? url : ""))));
	}
}