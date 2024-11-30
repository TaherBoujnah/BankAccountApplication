package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<Account>();


        String file= "C:\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccounts = utilities.CSV.read(file);


        for (String[] newAccount : newAccounts) {
            String name= newAccount[0];
            String SSN= newAccount[1];
            String accountType= newAccount[2];
            double initDeposit= Double.parseDouble(newAccount[3]);
            if (accountType.equals("Savings")) {
                System.out.println("Open a savings account");
                accounts.add(new Savings(name, SSN, initDeposit));
            }
            else if (accountType.equals("Checking")) {
                System.out.println("Open a checking account");
                accounts.add(new Checking(name, SSN, initDeposit));
            }
            else {System.out.println("ERROR READING ACCOUNT TYPE");}
        }

        for (Account account : accounts) {
         System.out.println("\n**********************");
         account.showInfo();
        }


    }
}