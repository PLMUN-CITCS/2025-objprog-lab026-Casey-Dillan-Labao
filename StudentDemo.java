class Student{
    static int studentCount=0;//tried this code without looking for instruction, just the desired output

    private int SID;
    private String name;
    private double GPA;

    public Student(int SID, String name, double GPA){
        this.SID=SID;
        this.name=name;
        this.GPA=GPA;
        studentCount++;
    }
    public Student(){
        this.SID=0;
        this.name="Unknown";
        this.GPA=0;
        studentCount++;
    }

    public static int getStudentCount(){
        return studentCount;
    }
    public void displayStudent(){
        System.out.println("Student ID: " + SID + "Name: " + name + "GPA: " + GPA);
    }
}

public class StudentDemo{
    public static void main(String[]args){
        Student[] list={
            new Student(101,"Alice",3.8),
            new Student(102,"Bob",3.5),
            new Student(103,"Charlie",3.9)
        };
        int y=Student.getStudentCount();
        for(int x=0;x!=y;x++){
            list[x].displayStudent();
        }
        System.out.println("Total students: " +Student.getStudentCount());


    }
}

