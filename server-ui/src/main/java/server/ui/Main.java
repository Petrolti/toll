package server.ui;

import dto.PointDTO;

/**
 * Created by PetrovOT on 07.11.2022.
 */

public class Main {
    public static void main(String... args) throws Exception {
        for (int i=0; i<5; i++) {
            System.out.println("Main.main say Hello!!!!");
            PointDTO pointDTO = new PointDTO();
            pointDTO.setLat(45);
            System.out.println(pointDTO.toJson());
            Thread.sleep(1000);
        }
    }
}
