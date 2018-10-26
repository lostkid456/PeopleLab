public class Teacher extends Person{

    private String Subject;
    private String Title;

    public Teacher(String firstName,String familyName, String Title, String Subject){
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }
    public String getSubject()
    {
        return(Subject);
    }
    public String toString() {
       // int i = (int)(Math.random() * 4 + 1);
        return(Title + ". " + this.getFamilyName());
    }

}
