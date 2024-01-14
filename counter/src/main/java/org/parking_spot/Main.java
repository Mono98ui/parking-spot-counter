package org.parking_spot;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        parkingSpot p1 = new parkingSpot();
        p1.start();

        try{
            p1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}