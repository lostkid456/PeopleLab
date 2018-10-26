public class Runner
{
    public static void main(String[] args)
    {
        Student student1= new Student("John","Zhao",2.3,0,0);
        Student student2= new Student("LoL","XD",2.0,0,0);
        Teacher teacher= new Teacher("Nathan","Levin","Mr","Computer Science");
        Student[] students={student1,student2};
        Classroom classroom1= new Classroom(teacher,students);
        System.out.println(classroom1+" Subject:"+teacher.getSubject());
        for(int i=0;i<students.length;i++) {
            System.out.println(students[i]);
        }
    }

}
