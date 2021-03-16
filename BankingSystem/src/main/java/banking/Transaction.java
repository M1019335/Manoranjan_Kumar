package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;
	
	Account account = new Account();
    	List<String> transactions = new ArrayList<>();

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		// complete the function
        return account.getBalance();
	}

	public void credit(double amount) {
		// complete the function
		transactions.add(account.deposit(amount));
	}

	public boolean debit(double amount) {
		// complete the function
		transactions.add(account.withdraw(amount));
        return true;
	}
}
