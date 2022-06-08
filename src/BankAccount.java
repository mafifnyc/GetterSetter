public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
        if(id<10) {
            this.id = 11;
        }
        else {
            this.id = id;
        }
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
        if(accountType == "s") {
            this.accountType = "Savings Account";
        }
        else  if(accountType == "c"){
            this.accountType="Current Account";
        }
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

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount chase = new BankAccount();
        chase.setName("Afif");
        chase.setEmail("afiffifa@hotmail.com");
        chase.setId(01);
        chase.setAccountType("a");
        System.out.println(chase.getName());
        System.out.println(chase.getEmail());
        System.out.println(chase.getId());
        System.out.println(chase.getAccountType());
    }
}
