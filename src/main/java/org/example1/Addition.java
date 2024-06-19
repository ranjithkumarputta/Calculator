package org.example1;

public class Addition {

    public int addition(int a,int b){
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        a.addition(10,20);

    }
}
