
/*public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ishan");
        System.out.println("Name is " + s.getName());

    }
}*/

class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    // retunrType dataTyype functionName()
    // Getter
    public long getAcc_no() {
        return acc_no;
    }

    // Setter
    public long setAcc_no(double d) {
        return this.acc_no = (long) d;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public float setAmount(double d) {
        return this.amount = (float) d;
    }
}


//Main function 
class Test {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("Ishan");
        a.setAcc_no(1010101010101010.0);
        a.setAmount(22222.00);
        a.setEmail("Subedishan10@gmail.com");
        
        System.out.println("---" + a.getName() + "---" + a.getEmail() + "---" + a.getAcc_no() + "---" + a.getAmount());
    }
}
