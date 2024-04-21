/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybank;

/**
 *
 * @author Shouvik
 */
public class Account {
    private int id;
    private AccountType accType;
    private float blanace;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountType getAccType() {
        return accType;
    }

    public void setAccType(AccountType accType) {
        this.accType = accType;
    }

    public float getBlanace() {
        return blanace;
    }

    public void setBlanace(float blanace) {
        this.blanace = blanace;
    }

    public Account(int id, AccountType accType, float blanace) {
        this.id = id;
        this.accType = accType;
        this.blanace = blanace;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", accType=" + accType + ", blanace=" + blanace + '}';
    }
    
}
