import java.util.Scanner;
abstract class BankAccountFactory {
    abstract BankAccount createAccount(String type);
}
class ForeignBankAccountFactory extends BankAccountFactory{

    public BankAccount createAccount(String type) {
        BankAccount bankAccount = null;
        if (type.equals("P")){
            bankAccount = new ForeignPersonalAccount();
        } else if (type.equals("B")){
            bankAccount = new ForeignPersonalAccount();
        } else if (type.equals("C")){
            bankAccount = new ForeignPersonalAccount();
        } else {
            System.out.println("Invalid input");
        }
        return bankAccount;
    }
}
class LocalBankAccountFactory extends BankAccountFactory{
    public BankAccount createAccount(String type) {
        BankAccount bankAccount = null;
        if (type.equals("P")){
            bankAccount = new LocalPersonalAccount();
        } else if (type.equals("B")){
            bankAccount = new LocalBusinessAccount();
        } else if (type.equals("C")){
            bankAccount = new LocalCheckingAccount();
        } else {
            System.out.println("Invalid input");
        }
        return bankAccount;
    }
}
class Branch {

    private BankAccountFactory bankAccountFactory;

    public Branch(BankAccountFactory bankAccountFactory){
        this.bankAccountFactory = bankAccountFactory;
    }

    public BankAccount createBankAccount(String type) {
        BankAccount bankAccount = null;
        bankAccount = bankAccountFactory.createAccount(type);
        bankAccount.validateUserIdentity();
        bankAccount.calculateInterestRate();
        bankAccount.registerAccount();

        return bankAccount;
    }
}
interface BankAccount {
    void validateUserIdentity();
    void calculateInterestRate();
    void registerAccount();
}
class ForeignBusinessAccount implements BankAccount {
    String name = "Foreign Business account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
class ForeignCheckingAccount implements BankAccount {
    String name = "Foreign Checking account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
class ForeignPersonalAccount implements BankAccount {
    String name = "Foreign Personal account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
class LocalBusinessAccount implements BankAccount {
    String name = "Local Business account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
class LocalCheckingAccount implements BankAccount {
    String name = "Local Checking account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
class LocalPersonalAccount implements BankAccount {
    String name = "Local Personal account";

    @Override
    public void validateUserIdentity() {
        System.out.println(name + ": Validating identity");
    }

    @Override
    public void calculateInterestRate() {
        System.out.println(name + ": Calculating interest rate");
    }

    @Override
    public void registerAccount() {
        System.out.println(name + ": Registering account");
    }
}
public class Factory {

    public static void main(String[] args) {

        BankAccount bankAccount = null;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter\n" +
                " P for Personal account\n" +
                " B for Business account\n" +
                " C for Checking account\n" +
                "----------------------------");

        String type = in.nextLine();

        Scanner inputBranch = new Scanner(System.in);

        System.out.println("Please enter\n" +
                " 1 for Local\n" +
                " 2 for Foreign\n" +
                "----------------------------");

        int branch = inputBranch.nextInt();

        if (branch == 1) {
            Branch localBranch = new Branch(new LocalBankAccountFactory());
            bankAccount = localBranch.createBankAccount(type);
        } else if (branch == 2) {
            Branch foreignBranch = new Branch(new ForeignBankAccountFactory());
            bankAccount = foreignBranch.createBankAccount(type);
        }
    }

}
