class Person {
     String name;
     int age;
     String address;

    // Constructor for the Person class
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Teacher class inheriting from Person class
class Teacher extends Person {
    private String institutionName;
    private String className;

    // Constructor for the Teacher class
    public Teacher(String name, int age, String address, String institutionName, String className) {
        super(name, age, address); // Call the Person class constructor
        this.institutionName = institutionName;
        this.className = className;
    }

    // Method to display Teacher information

    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method from the Person class
        System.out.println("Institution: " + institutionName);
        System.out.println("Class: " + className);
    }
}

class School7{
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("An", 18, "Tang 4 Muong Thanh");
        System.out.println("Person Information:");
        person1.displayInfo();

        // Create a Teacher object
        Teacher teacher1 = new Teacher("Thay Kha Banh", 20, "Trong Tu", "Truong Doi", "Cach de mua quat chuan 2077");
        System.out.println("\nTeacher Information:");
        teacher1.displayInfo();


    }
}
