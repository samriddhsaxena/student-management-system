import java.util.ArrayList;
import java.util.List;
public class StudentManSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void viewStudents(){
        students.forEach(System.out::println);
    }
    public void updateStudent(int id,String newname,String newGrade){
        for(Student student:students){
            if(student.getId()==id){
                student.setName(newname);
                student.setGrade(newGrade);
                break;
            }
        }
    }
    public void deleteStudent(int id){
        students.removeIf(student -> student.getId() == id);
    }
    public Student searchByName(String name){
        for(Student student:students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
