package bankAccount;

public class Account {
  private CardHolder cardHolder;
  private Amount balance;

  public Account(CardHolder cardHolder, Amount balance) {
    this.cardHolder = cardHolder;
    this.balance = balance;
  }

  public CardHolder getCardHolder() {
    return cardHolder;
  }

  public Amount getBalance() {
    return balance;
  }

  public Amount balanceAftDeposit(Amount depositAmount){
    int newCents = this.balance.getCents() + depositAmount.getCents();
    int incrOnDollars = newCents >= 100 ? 1 : 0;
    newCents = newCents >= 100 ? newCents -100 : newCents;

    int newDollars = this.balance.getDollar() + depositAmount.getDollar() + incrOnDollars;

    return new Amount(newDollars, newCents);
  }

  public Amount balanceAftWithdraw(Amount withdrawAmount) {
    int newCents = this.balance.getCents() - withdrawAmount.getCents();
    int decrOnDollars = newCents < 0 ? 1 : 0;
    newCents = newCents <= 0 ? newCents +100 : newCents;

    int newDollars = this.balance.getDollar() - withdrawAmount.getDollar() - decrOnDollars;

    return new Amount(newDollars, newCents);
  }

}
