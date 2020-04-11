package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

public class BlockChain {

    private Block[] chain;
    private Transaction[] transactions;
    private int chainPointer;
    private int transactionPointer;

    public BlockChain() {
        this.chain = new Block[10];
        this.transactions = new Transaction[20];
        this.chainPointer = -1;
        this.transactionPointer = 0;

        initBlock();
    }

    private void initBlock() {
        // create new block
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Transaction[] copy = transactions.clone();
        Block initBlock = new Block(0, timestamp.getTime(), copy, "1");

        // forge chain to block
        chain[chainPointer] = initBlock;
        chainPointer++;
    }

    public int getChainPointer() {
        return chainPointer;
    }

    public int getTransactionPointer() {
        return transactionPointer;
    }

    public void hash(Block block) throws NoSuchAlgorithmException {
        // creates a SHA-256 hash of a block
        // https://www.geeksforgeeks.org/sha-256-hash-in-java/
        MessageDigest md = MessageDigest.getInstance("SHA-256");
//        System.out.println(md.digest(String));
    }

    public Block getLastBlock() {
        // will need to return last block
        return chain[chainPointer];
    }

    public static boolean validProof() {
        // validates the proof and checks to see if 3 leading 0 in hash
        return false;
    }

    private void resizeChain() {
        // initializing at 10
        // need to watch for 70% capacity
    }

    private void resizeTransactions() {
        // initializing at 20
        // need to watch for 70% capacity
    }

    private void forgeBlock() {
        // need to create a new block

//        <params>
//        private int index;
//        private long timestamp;
//        private Transaction[] transactions;
//        private String proof;
//        private String previousHash;

        // need to increment chainPointer after adding to Array
    }

//    private Transaction newTransaction() {
        // needs to create a new transaction object and return
        // need to increment transactionPointer;
//        return new Transaction("Test", "Test", 0.0, 5);
//    }
}
