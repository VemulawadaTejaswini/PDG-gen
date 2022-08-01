//110
public class func{
	public void getConcept(int i){
      PreparedStatement srcConceptPs = db.getConnection().prepareStatement("SELECT concept_id FROM concept_mapping WHERE page_id = ?");
      srcConceptPs.setInt(1, i);
      ResultSet res = srcConceptPs.executeQuery();
      if (res.next()) {
        return res.getInt("concept_id");
      }
}
}
