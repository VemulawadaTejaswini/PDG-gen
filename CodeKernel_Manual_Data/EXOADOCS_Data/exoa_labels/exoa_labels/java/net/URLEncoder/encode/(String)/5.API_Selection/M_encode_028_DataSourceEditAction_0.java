public class A{
	public void doPost(HttpServletRequest req, HttpServletResponse res)  {
		
		try {
			String point = ".";
			if (req.getParameter("Path").equals(""))point="";
			String	idname = req.getParameter("Path")+point+req.getParameter("Name");
			
			UsqlgDirContext ctx = JndiManager.getInstance().getRootContext();
			
			
			
			UsqlgDataSource dataSource =	ctx.retrieveByID(idname);
			
			
			
			String param = "?=" +"Name=" + idname + "&" +"Path=" + java.net.URLEncoder.encode(dataSource.getPath())+"&"+"Url=" + java.net.URLEncoder.encode(dataSource.getUrl()) + "&" +"SQLProxyServlet_URL=" + java.net.URLEncoder.encode(dataSource.getProxyURL()) + "&" +"Driver=" + java.net.URLEncoder.encode(dataSource.getDriver()) + "&" +"User=" + java.net.URLEncoder.encode(dataSource.getUser()) + "&" +"Password=" + java.net.URLEncoder.encode(dataSource.getPassword());

			System.out.println(param);
			
			getServletContext().setAttribute("net.opense.error_msg", null);
			req.getRequestDispatcher("DataSourceEdit.jsp" + param).forward(req, res);
			return;
			
		} catch (Exception e) {
			try {
				System.out.println(e);
				StringWriter sw = new StringWriter();
				PrintWriter writer = new PrintWriter(sw);
				
				req.setAttribute("net.opense.error_msg", sw.toString());
				req.getRequestDispatcher("DataSourceOverview.jsp").forward(req, res);
				return;
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}