package org.parking_spot;

import static java.lang.Thread.sleep;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int countNbrSpot(parkingSpot[] parking){
        int nbrSpot = 0;
        for (int i =0; i < parking.length; i++ ){
            synchronized  (parking[i]){
                if(parking[i].isAvailable){
                    nbrSpot++;
                }
            }
        }


        return nbrSpot;
    }
    public static void main(String[] args) {

        parkingSpot[] parking = new parkingSpot[100];

        for (int i =0; i < parking.length; i++ ){
            parking[i] = new parkingSpot();
            parking[i].start();
        }

        System.out.println("All thread started");

        while (true){
            try {
                sleep(10000);
                System.out.println(countNbrSpot(parking));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}