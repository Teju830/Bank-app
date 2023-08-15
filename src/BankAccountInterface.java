public interface BankAccountInterface {
    String fetchbalance(String password);
    String addmoney(double amount);
    String widthdrawmoney(double money , String password);
    String changepassword(String oldpassword , String newpassword);
    double calculateinterest(int year);
}
