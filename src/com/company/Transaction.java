package com.company;

public class Transaction {

    private String sender;
    private String recipient;
    private double amount;
    // the index of the block that will hold this transaction
    private int index;

    public Transaction(String sender, String recipient, double amount, int index) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.index = index;
    }

}
