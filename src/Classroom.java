public class Classroom
{
    private Student[] students;
    private Teacher teacher;

    public Classroom(Teacher teacher, Student[] students)
    {
        this.students=students;
        this.teacher=teacher;
    }

    public String getSubject()
    {
        return getSubject();
    }
    public  String classAverage()
    {
        double x=0;
        for(int i=0;i<students.length;i++)
        {
            x+=students[i].getGPA();
        }
        return "Class GPA:"+x/students.length;
    }
    public String printClass()
    {
        return printClass();
    }

    public String toString()
    {
        return teacher+","+classAverage();
    }

}
