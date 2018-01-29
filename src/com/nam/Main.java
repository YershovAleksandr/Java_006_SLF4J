package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Thread.*;

public class Main {

    final static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here

        logger.info("Info");

        logger.debug("Debug");

        logger.warn("Warn");

        logger.error("Error");

        wtf();

    }

    private static void wtf()
    {
        logger.error("Wtf");

        MMM mmm = new MMM();

        mmm.MMM();
    }
}

class MMM
{
    final static Logger logger = LoggerFactory.getLogger(Main.class);

    void MMM()
    {
        logger.debug("MMM");


        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {

                //do {
                    logger.debug("Run!!");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Work wrk = new Work();

                    wrk.DoId();
                //} while (true);
            }
        });

        th.start();
    }
}
