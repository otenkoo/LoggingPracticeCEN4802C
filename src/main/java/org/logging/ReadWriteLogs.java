package org.logging;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;

public class ReadWriteLogs extends LogStart {

    public void writeLogs(){
        try {
            for(int i = 0; i < 100; i++){
                int randomNumber = (int)(Math.random() * ((25 - 15) + 1)) + 15;
                if(randomNumber < 18){
                    logger.info("MINOR" + "\n===========================================================");
                }
                else if(randomNumber >= 18 && randomNumber <= 20){
                    logger.info("PRODUCT RESTRICTIONS" + "\n===========================================================");
                }
                else{
                    logger.info("ADULT" + "\n===========================================================");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception :  " + e + "\n===========================================================");
            logger.log(Level.WARNING, "Calling Method Again" + "\n===========================================================");
            writeLogs();
        }
    }

    public void readLogs() {
        try{
        Scanner sc = new Scanner(new File("appLog.txt"));
        System.out.println("Parsing log for SEVERE/WARNING levels recorded");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains("SEVERE") || line.contains("WARNING")) {
                System.out.println("===========================================================");
                System.out.println(line);
            }
        }
        System.out.println("===========================================================");
        System.out.println("LOGS SUCCESSFULLY PARSED");
        sc.close();
        }catch(Exception e){
            System.out.println("===========================================================");
            System.out.println("LOGS NOT PARSED");
            System.out.println("===========================================================");
        }
    }

}
