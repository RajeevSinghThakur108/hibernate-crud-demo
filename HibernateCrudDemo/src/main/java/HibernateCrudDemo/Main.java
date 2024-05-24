package HibernateCrudDemo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        // Create a new student
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setCity("New York");
        studentDao.saveStudent(student1);

        // Read all students
        List<Student> students = studentDao.getAllStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", City: " + student.getCity());
        }

        // Update a student
        Student student2 = studentDao.getStudent(student1.getId());
        student2.setCity("Los Angeles");
        studentDao.updateStudent(student2);

        // Read the updated student
        Student updatedStudent = studentDao.getStudent(student1.getId());
        System.out.println("Updated Student: " + updatedStudent.getName() + ", City: " + updatedStudent.getCity());

        // Delete the student
       // studentDao.deleteStudent(student1.getId());

        // Verify deletion
       // Student deletedStudent = studentDao.getStudent(student1.getId());
        //System.out.println("Deleted Student: " + deletedStudent);
    }
}
