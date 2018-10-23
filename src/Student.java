public class Student extends Person {

    //fields
    private double GPA;
    private int absences;
    private int tardies;

    //constructor
    public Student(String firstName,String familyName, double GPA, int absences, int tardies)
    {
        super(firstName,familyName);
        this.GPA = GPA;
        this.absences = absences;
        this.tardies = tardies;
    }

    //methods

    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }




    public int getAbsences()
    {
        return absences;
    }

    public void setAbsences(int absences)
    {
        this.absences = absences;
    }




    public int getTardies()
    {
        return tardies;
    }

    public void setTardies(int tardies)
    {
        this.tardies = tardies;
    }




    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName()+" GPA:"+GPA+" Absences:"+absences+" Tardies:"+tardies;
    }
}
