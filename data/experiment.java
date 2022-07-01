public class func{
  public void assign(HashMap<String,DBIDs> labelMap,String label,DBIDRef id){
      if (labelMap.containsKey(label)) 
      {
          DBIDs exist=labelMap.get(label);
            
          if (exist instanceof DBID) {
              ModifiableDBIDs n=DBIDUtil.newHashSet();
              n.add(id);
              labelMap.put(label,n);    
          }
          else {   
              ((ModifiableDBIDs)exist).add(id);
          }   
          
      }
      else {
          labelMap.put(label,DBIDUtil.deref(id));
          }
      }
}