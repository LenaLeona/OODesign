package bankAccount;

/**
 * The type Amount.
 */
public class Amount {
  private int dollar;
  private int cents;

  /**
   * Instantiates a new Amount.
   *
   * @param dollar the dollar
   * @param cents  the cents
   */
  public Amount(Integer dollar, Integer cents) {
    this.dollar = dollar;
    this.cents = cents;
  }

  /**
   * Gets dollar.
   *
   * @return the dollar
   */
  public Integer getDollar() {
    return dollar;
  }

  /**
   * Sets dollar.
   *
   * @param dollar the dollar
   */
  public void setDollar(int dollar) {
    if (dollar < 0) {
      throw new IllegalArgumentException("Amount must be greater than or equal to 0");
    } else {
      this.dollar = dollar;
    }
  }

  /**
   * Gets cents.
   *
   * @return the cents
   */
  public Integer getCents() {
    return cents;
  }

  /**
   * Sets cents.
   *
   * @param cents the cents
   */
  public void setCents(int cents) {
    if (cents >= 0 && cents <= 99) {
      this.cents = cents;
    } else {
      throw new IllegalArgumentException(
          "Amount must be greater than or equal to 0, and less than or equal to 99");
    }
  }

}
