class University {
    static class Department{
        void displayInfo(){
            System.out.println("Department name: Chemistry");
            System.out.println("Faculty members: 15");
        }
    }

    public static void main(String[] args) {
        Department D = new Department();
        D.displayInfo();
    }
    
}
