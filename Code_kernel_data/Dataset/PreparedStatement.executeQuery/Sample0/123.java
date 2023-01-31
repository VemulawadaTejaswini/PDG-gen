//122
public class func{
	public void loadFromDb(DB db){
    PreparedStatement ps = db.getConnection().prepareStatement("SELECT * FROM concept_mapping");
    ResultSet res = ps.executeQuery();
    while (res.next()) {
      long conceptId = res.getLong("concept_id");
      long pageId = res.getLong("page_id");
      if (!conceptMap.containsKey(conceptId)) {
        conceptMap.forcePut(conceptId, pageId);
      }
      conceptMapX.put(conceptId, pageId);
    }
}
}
