package org.logging;

public class App 
{
    public static void main( String[] args )
    {
        ReadWriteLogs readWriteLogs = new ReadWriteLogs();
        readWriteLogs.start();
        readWriteLogs.writeLogs();
        readWriteLogs.logger.info( "CREATED LOG" + "===========================================================");
        readWriteLogs.readLogs();
    }
}
