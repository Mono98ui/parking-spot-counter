package org.parking_spot;

public class nbrSpot {

    int spot;
    int nbrSpot = 0;

    boolean[] parkingAvailable;

    public nbrSpot(int spot){
        this.spot = spot;
        parkingAvailable = new boolean[spot];
    }

    public int countNbrSpot(parkingSpot[] parking){
        nbrSpot = 0;
        for (int i =0; i < parking.length; i++ ){
                if(parking[i].isAvailable){
                    nbrSpot++;
                    parkingAvailable[i] = true;
                    continue;
                }
                parkingAvailable[i] = false;
        }

        for (int i =0; i < parkingAvailable.length; i++ ){
            String av = parkingAvailable[i] ? "*":" ";
            if(i % 10 == 0){
                System.out.println();
                System.out.println("=======================");
            }
            System.out.print("|"+av);
        }
        System.out.println();
        System.out.println("=======================");


        return nbrSpot;
    }
}
