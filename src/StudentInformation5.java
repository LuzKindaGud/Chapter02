import java.util.Arrays;

class Student {
    private String name;
    private int age;
    private String address;
    private int[] marks;

    // Constructor
    public Student(String name, int age, String address, int[] marks) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }


    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0;
        }
        return Arrays.stream(marks).average().orElse(0);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Average Mark: " + calculateAverage());
    }
}

class StudentInformation5 {
    public static void main(String[] args) {
        int[] marks1 = {85, 92, 78, 95, 88};
        Student student1 = new Student("An", 18, "Tang 4 Muong Thanh", marks1);
        student1.displayStudentInfo();

        Student student2 = new Student("Duong Gio Tay", 20, "8386 Mai Dinh", new int[0]);
        student2.displayStudentInfo();

    }
}