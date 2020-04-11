package com.company;

public class Block {

    private int index;
    private long timestamp;
    private Transaction[] transactions;
    private String proof;
    private String previousHash;

    public Block(int index, long timestamp, Transaction[] transactions, String proof) {
        this.index = index;
        this.timestamp = timestamp;
        this.transactions = transactions;
        this.proof = proof;
    }

    public Block(int index, long timestamp, Transaction[] transactions, String proof, String previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.transactions = transactions;
        this.proof = proof;
        this.previousHash = previousHash;
    }
}
