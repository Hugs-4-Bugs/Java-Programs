class ParentClass {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("This is child class");
    }


    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.parentMethod();
        
        ChildClass child = new ChildClass();
        child.childMethod();
        child.parentMethod();
    }
}
