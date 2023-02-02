//37
public class func{
public void getMappedTableNameToRecordIndividual(URI individual){
    String fragment = individual.getFragment();
    String[] tokens = fragment.split("&");
    for (String token: tokens) {
      String[] pair = token.split("=");
      if (pair[0].equals(OntMapper.TABLE_NAME)) {
        return pair[1];
      }
    }
}
}
