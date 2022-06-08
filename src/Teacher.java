public class Teacher {
    private String name;
    private String subject;
    private int students;
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setStudents(int students) {
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }

    public int getStudents() {
        return students;
    }

    public static void main(String[] args) {
        Teacher sana = new Teacher();
        sana.setName("Afif");
        sana.setSubject("QA");
        sana.setStudents(12);
        System.out.println(sana.getName());
        System.out.println(sana.getSubject());
        System.out.println(sana.getStudents());
    }
}
