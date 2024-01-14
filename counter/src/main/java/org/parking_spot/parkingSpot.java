package org.parking_spot;

import java.util.Random;

public class parkingSpot extends Thread{

    boolean isAvailable = true;

    public parkingSpot(){
    }

    public void available(){
        this.isAvailable = true;
    }

    public void unavailable(){
        this.isAvailable = false;
    }
    @Override
    public void run() {
        super.run();
        while(true){
            Random rand = new Random();
            try {
                int sec = rand.nextInt(10000)+1000;
                sleep(sec);
                available();
                sec = rand.nextInt(10000)+1000;
                sleep(sec);
                unavailable();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
