package org.logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogStart {
    protected Logger logger = Logger.getLogger("appLog.txt");

    public void start(){
        FileHandler fh;
        try {
            fh = new FileHandler("appLog.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("Application started \n" + "===========================================================");
        } catch (Exception e) {
            logger.log(Level.WARNING, "Failed to create file handler for logging", e);
        }
    }

}
