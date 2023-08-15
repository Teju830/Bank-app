import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    private String accountnumber;
    private double balance;
    private String password;
    final double rateofinterest = 1.7;
    final String IFSCcode = "HDFC37456";

    public HDFCAccount() { // created default constructor using shortcut alt+insert

    }

    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.accountnumber= String.valueOf(UUID.randomUUID());//we are having uuid class in java.util package.and uuid have ramdomuuid fuction to generate random number
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    @Override
    public String fetchbalance(String password) {

        if(this.password.equals(password)) return "The balance is "+this.balance;
        return "incorrect password";
    }

    @Override
    public String addmoney(double amount) {
        this.balance+=amount;
        return "successfully added money.total balance is :"+this.balance;
    }

    @Override
    public String widthdrawmoney(double money, String password) {
        if(this.password.equals(password)){
            if(this.balance < money){
                return "insufficient balance";
            }
            this.balance -= money;
            return "widthdrawed money successfully . new balance is :"+ this.balance;
        }
        return"incorrect password";
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword)){
            this.password=newpassword;
            return "password changed successfully";
        }
        return "incorrect original password";
    }

    @Override
    public double calculateinterest(int year) {
        return (this.balance*year*rateofinterest)/100.0;  // formula P*R*T/100 ;p=principal amount;r=rateofinterest; t = time or year;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", rateofinterest=" + rateofinterest +
                ", IFSCcode='" + IFSCcode + '\'' +
                '}';
    }
}
