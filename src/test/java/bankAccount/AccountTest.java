package bankAccount;

import org.junit.Assert;

public class AccountTest {
  private CardHolder cardHolder;
  private Amount balance;
  private Amount depositAmount;
  private Amount withdrawAmount;
  private Account account;

  @org.junit.Before
  public void setUp() throws Exception {
    this.cardHolder = new CardHolder("Anna","Taylor");
    this.balance = new Amount(200, 20);
    this.depositAmount = new Amount(50,15);
    this.withdrawAmount = new Amount(30,35);
    this.account = new Account(cardHolder,balance);
  }


  @org.junit.Test
  public void getCardHolder() {
    Assert.assertEquals("Anna", this.account.getCardHolder().getFirstName());
    Assert.assertEquals("Taylor", this.account.getCardHolder().getLastName());
  }

  @org.junit.Test
  public void getBalance() {
    Assert.assertEquals(new Integer(200), this.account.getBalance().getDollar());
    Assert.assertEquals(new Integer(20), this.account.getBalance().getCents());
  }

  @org.junit.Test
  public void balanceAftDeposit() {
    Assert.assertEquals(new Integer(250), this.account.balanceAftDeposit(depositAmount).getDollar());
    Assert.assertEquals(new Integer(35), this.account.balanceAftDeposit(depositAmount).getCents());
  }

  @org.junit.Test
  public void balanceAftWithdraw() {
    Assert.assertEquals(new Integer(169), this.account.balanceAftWithdraw(withdrawAmount).getDollar());
    Assert.assertEquals(new Integer(85), this.account.balanceAftWithdraw(withdrawAmount).getCents());
  }
}