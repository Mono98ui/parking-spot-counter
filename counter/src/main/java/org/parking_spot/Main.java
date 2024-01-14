package org.parking_spot;

import static java.lang.Thread.sleep;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int spot = 100;
    public static void main(String[] args) {

        nbrSpot nbr = new nbrSpot(spot);
        parkingSpot[] parking = new parkingSpot[spot];

        for (int i =0; i < parking.length; i++ ){
            parking[i] = new parkingSpot();
            parking[i].start();
        }

        System.out.println("All thread started");

        while (true){
            try {
                sleep(10000);
                System.out.println(String.valueOf(nbr.countNbrSpot(parking))+" available spots");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}