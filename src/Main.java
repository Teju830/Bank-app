// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HDFCAccount teja = new HDFCAccount("Teja",2000,"Teju1234");
        System.out.println(teja); // if we call object like this it will print address of our obj but we want to print attribute values
                                 // for that we to override tostring method in hdfcaccount class


        // check all the methods working crt or not
        // fecth balance
        System.out.println(teja.fetchbalance("Teju1234")); // crt password
        System.out.println(teja.fetchbalance("Teju123")); // wrong password

        //add money
        System.out.println(teja.addmoney(30000));
        // widthdraw money

        System.out.println(teja.widthdrawmoney(3000,"Teju1234"));
        System.out.println(teja.widthdrawmoney(40000,"Teju1234")); // less amount
        System.out.println(teja.widthdrawmoney(3000,"Teju12")); // wrong password

        //change password
        System.out.println(teja.changepassword("Teju1234","Teju830"));
        System.out.println(teja.changepassword("Teju12","Teju830")); // with wrong old password

        // calculate interest
        System.out.println(teja.calculateinterest(5));

    }
}