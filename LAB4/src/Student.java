import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;
    public Student(){}
    public Student(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        this.fullName = sc.nextLine();
        System.out.println("Nhap tuoi");
        this.age = sc.nextInt();
    }
    public void displayInfo(){
        System.out.println("Ho va ten: " + this.fullName);
        System.out.println("Tuoi:" + this.age);
    }
    public void addInfo(String fullName,int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void editInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sua ho va ten (hien tai: " + this.fullName + "):");
        this.fullName = sc.nextLine();
        System.out.println("Sua tuoi (hien tai :" + this.age +"):");
        this.age = sc.nextInt();
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.inputInfo();
        student.displayInfo();
        student.addInfo("Nguyen Van A", 20);
        student.displayInfo();
        student.editInfo();
        student.displayInfo();
    }
}
