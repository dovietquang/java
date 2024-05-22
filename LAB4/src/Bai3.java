import java.util.LinkedList;
import java.util.Scanner;

public class Bai3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> linkedList = new LinkedList<>();
        
        while (true) {
            Student newStudent = new Student();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
                    newStudent.fullName = name;
                    System.out.print("Enter mark : ");
                    double mark = sc.nextDouble();
                    sc.nextLine();
                    newStudent.markStudent = mark;
                    linkedList.add(newStudent);
        }

        showStudentFailMark(linkedList);
        showStudentBestExams(linkedList);
        foundStudent(linkedList);
        sc.close();
    }
    
}
