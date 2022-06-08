public class Employee {
    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
        if(id>50) {
            this.id = 0;
        }
        else {
            this.id = id;
        }

    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void getSalary() {

        if(salary>10000 || salary<5000) {
            System.out.println("It is not a good manner to ask someone's salary");
        }
        else {
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bond");
        emp.setEmail("JamesBond@izaanmail.com");
        emp.setId(007);
        emp.setSalary(5001f);
        System.out.println(emp.getName());
        System.out.println(emp.getEmail());
        System.out.println(emp.getId());
        emp.getSalary();
    }
}
