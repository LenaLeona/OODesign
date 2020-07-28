package bankAccount;

/**
 * The type Card holder.
 */
public class CardHolder {
  private String firstName;
  private String lastName;

  /**
   * Instantiates a new Card holder.
   *
   * @param firstName the first name
   * @param lastName  the last name
   */
  public CardHolder(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }

}
