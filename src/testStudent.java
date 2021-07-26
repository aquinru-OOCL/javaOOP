import model.Student;

public class testStudent {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Russel");
        student.setGender("Male");
        student.setAge(17);
        student.setStudentNumber(202100000);

        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getAge());
        System.out.println(student.getStudentNumber());
    }
}
