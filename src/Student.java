public class Student extends Person {

    //fields
    private double GPA;
    private int absences;
    private int tardies;

    //constructor
    public Student(String firstName,String familyName, Double GPA, int absences, int tardies)
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

    public int getAbsences()
    {
        return absences;
    }

    public int getTardies()
    {
        return tardies;
    }

    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName();
    }
}
