import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }
    /** ACCOUNT.*/
    private int accountNumber;
    /** ACCOUNT.*/
    private BankAccountType accountType;
    /** ACCOUNT.*/
    private double accountBalance;
    /** ACCOUNT.*/
    private String ownerName;
    /** ACCOUNT.*/
    private double interestRate;
    /** ACCOUNT.*/
    private double interestEarned;

    /**
     *
     * @param name name of the accout.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        accountNumber = (int) Math.random();
        accountBalance = 0;
        interestRate = 0;
        interestEarned = 0;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     *
     * @return the account number.
     */
    public int getAccountNumber() {
        int number = accountNumber;
        return number;
    }

    /**
     *
     * @param setAccountNumber the account number to set
     * @return
     */
    public int setAccountNumber(final int setAccountNumber) {
        accountNumber = setAccountNumber;
        return accountNumber;
    }

    /**
     *
     * @return the type.
     */
    public BankAccountType getBankAccountType() {
        BankAccountType type = accountType;
        return type;
    }

    /**
     *
     * @param setType type.
     * @return
     */
    public BankAccountType setType(final BankAccountType setType) {
        accountType = setType;
        return accountType;
    }

    /**
     *
     * @return the balance
     */
    public double getAccountBalance() {
        double balance = accountBalance;
        return balance;
    }
}
