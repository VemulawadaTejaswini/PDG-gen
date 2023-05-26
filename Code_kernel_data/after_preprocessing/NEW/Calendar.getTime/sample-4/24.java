//24
public class func{
public void setModificationDate(Calendar modificationDate){
        if (modificationDate != null) {
            this.setModification(modificationDate.getTime());
        } else {
            this.setModification(null);
        }
}
}
