class Member {
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private float salary;
    
    public Member(String name, int age, long phoneNumber, String address, float salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public long getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
}

class Employee extends Member {
    private String specialization;
    
    public Employee(String name, int age, long phoneNumber, String address, float salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    
    public String getSpecialization() {
        return specialization;
    }
}

class Manager extends Member {
    private String department;
    
    public Manager(String name, int age, long phoneNumber, String address, float salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, 1234567890, "123 Main Street", 50000.0f, "Software Engineer");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Specialization: " + employee.getSpecialization());
        employee.printSalary();
        
        System.out.println();
        
        Manager manager = new Manager("Jane Doe", 40, 976543210, "456 Main Street", 100000.0f, "Sales");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Phone Number: " + manager.getPhoneNumber());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Department: " + manager.getDepartment());
        manager.printSalary();
    }
}
