public class A{
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			String fName = req.getParameter("Name");
			
			FilterDAO fdao = (FilterDAO) getServletContext().getAttribute("net.opense.filter_dao");
			Filter filter =	fdao.retrieveFilter(fName);
			
			
			
			String param = "?" +"name=" + java.net.URLEncoder.encode(filter.getName()) + "&" +"desc=" + java.net.URLEncoder.encode(filter.getDescription()) + "&" +"pattern=" + java.net.URLEncoder.encode(filter.getPattern());

			System.out.println(param);
			
			getServletContext().setAttribute("net.opense.error_msg", null);
			req.getRequestDispatcher("FilterEdit.jsp" + param).forward(req, res);
			return;
			
		} catch (Exception e) {
			try {
				StringWriter sw = new StringWriter();
				PrintWriter writer = new PrintWriter(sw);
				e.printStackTrace(writer);
				
				req.setAttribute("net.opense.error_msg", sw.toString());
				req.getRequestDispatcher("FilterOverview.jsp").forward(req, res);
				return;
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}