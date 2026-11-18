package Excercie;
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}

class OnlineStudent extends Student {
    String zoomId;

    public OnlineStudent(String name, String studentId, String zoomId) {
        super(name, studentId);
        this.zoomId = zoomId;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Student ID: " + studentId + ", Zoom ID: " + zoomId);
    }
}

public class Main3 {
    public static void main(String[] args) {
        OnlineStudent os = new OnlineStudent("David", "S12345", "zoom_david99");
        os.displayInfo(); // Confirms inheritance from all parent levels
    }
}