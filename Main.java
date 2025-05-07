public class Main {
    public static void main(String[] args) {
        StudentManSystem studentManSystem = new StudentManSystem();
        studentManSystem.addStudent(new Student(1, "A", "A+"));
        studentManSystem.addStudent(new Student(2, "B", "A+"));

    System.out.println("Students List:");
    studentManSystem.viewStudents();

    studentManSystem.updateStudent(1, "C", "A+");
    System.out.println();

    System.out.println("Updated Students List:");
    studentManSystem.viewStudents();
    System.out.println();
    
    System.out.println("Searching for student with name 'A':");
    Student foundStudent = studentManSystem.searchByName("A");
    if (foundStudent != null) {
        System.out.println(foundStudent);
    } else {
        System.out.println("Student not found.");
    }
    System.out.println();

    studentManSystem.deleteStudent(1);
    System.out.println("Students List after delete:");
    studentManSystem.viewStudents();
}
}
