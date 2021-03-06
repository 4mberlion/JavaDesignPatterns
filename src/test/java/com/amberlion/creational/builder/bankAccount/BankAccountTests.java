package com.amberlion.creational.builder.bankAccount;

import com.amberlion.creational.builder.bankAccount.BankAccount;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class BankAccountTests {

    @Test
    public void testGetAccountNumber() {
        BankAccount account = new BankAccount.Builder()
                .accountNumber(123L)
                .build();
        Assert.assertEquals(account.getAccountNumber(), 123L);
    }
    @Test
    public void testSetAccountNumber() {
        BankAccount account = new BankAccount.Builder()
                .accountNumber(123L)
                .build();
        account.setAccountNumber(234L);
        Assert.assertEquals(account.getAccountNumber(), 234L);
    }
    @Test
    public void testGetOwner() {
        BankAccount account = new BankAccount.Builder()
                .withOwner("Marge")
                .build();
        Assert.assertEquals(account.getOwner(), "Marge");
    }
    @Test
    public void testSetOwner() {
        BankAccount account = new BankAccount.Builder()
                .withOwner("Marge")
                .build();
        account.setOwner("Homer");
        Assert.assertEquals(account.getOwner(), "Homer");
    }
    @Test
    public void testGetBranch() {
        BankAccount account = new BankAccount.Builder()
                .atBranch("Springfield")
                .build();
        Assert.assertEquals(account.getBranch(), "Springfield");
    }
    @Test
    public void testSetBranch() {
        BankAccount account = new BankAccount.Builder()
                .atBranch("Springfield")
                .build();
        account.setBranch("AutumnField");
        Assert.assertEquals(account.getBranch(), "AutumnField");
    }
    @Test
    public void testGetBalance() {
        BankAccount account = new BankAccount.Builder()
                .openingBalance(new BigDecimal("100.0"))
                .build();
        Assert.assertEquals(account.getBalance(), new BigDecimal("100.0"));
    }
    @Test
    public void testSetBalance() {
        BankAccount account = new BankAccount.Builder()
                .openingBalance(new BigDecimal("100.0"))
                .build();
        account.setBalance(new BigDecimal("101.0"));
        Assert.assertEquals(account.getBalance(), new BigDecimal("101.0"));
    }
    @Test
    public void testGetInterestRate() {
        BankAccount account = new BankAccount.Builder()
                .atRate(new BigDecimal("2.5"))
                .build();
        Assert.assertEquals(account.getInterestRate(), new BigDecimal("2.5"));
    }
    @Test
    public void testSetInterestRate() {
        BankAccount account = new BankAccount.Builder()
                .atRate(new BigDecimal("2.5"))
                .build();
        account.setBalance(new BigDecimal("2.0"));
        Assert.assertEquals(account.getBalance(), new BigDecimal("2.0"));
    }
    @Test
    public void testConstructAccount() {
        BankAccount account = new BankAccount.Builder()
                .accountNumber(123L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(new BigDecimal("100.0"))
                .atRate(new BigDecimal("2.5"))
                .build();
        Assert.assertEquals(account.getAccountNumber(), 123L);
        Assert.assertEquals(account.getOwner(), "Marge");
        Assert.assertEquals(account.getBranch(), "Springfield");
        Assert.assertEquals(account.getBalance(), new BigDecimal("100.0"));
        Assert.assertEquals(account.getInterestRate(), new BigDecimal("2.5"));
    }

}