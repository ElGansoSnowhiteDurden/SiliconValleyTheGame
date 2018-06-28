/**
 *
 */
package com.siliconvalley.it.model.rule;

/**
 * @author ElGansoSnowhiteDurden
 *
 */
public class BillOfExchange {

  private int credit;
  private int debit;

  public BillOfExchange() {
    super();
  }

  public BillOfExchange(int credit, int debit) {
    super();
    this.credit = credit;
    this.debit = debit;
  }

  public int getCredit() {
    return credit;
  }

  public int getDebit() {
    return debit;
  }

  public void setCredit(int credit) {
    this.credit = credit;
  }

  public void setDebit(int debit) {
    this.debit = debit;
  }

}
