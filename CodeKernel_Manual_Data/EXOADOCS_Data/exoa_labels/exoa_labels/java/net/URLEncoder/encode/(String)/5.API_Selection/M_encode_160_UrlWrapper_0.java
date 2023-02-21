public class A{
	private String buildQuery() {
		String query = "";
		
		Iterator<String> it = queryMap.keySet().iterator();
		int i = 1;
		while (it.hasNext()) {
			if (i == 1) {
				query += "?";
			}
			String key = it.next();
			query += encode(key) + "=" + encode(queryMap.get(key));
			
			if (i != queryMap.size()) {
				query += "&";
			}
			i++;
		}
		return query;
	}
}