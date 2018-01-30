package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import x42.x24.Foo;

public class Work
{
    final static Logger logger = LoggerFactory.getLogger(Work.class);

    public void DoId()
    {
        logger.info("Do it!");
        logger.info("Just DO IT!");
        logger.info("What are you waiting for??");

        JustDoIt();
    }

    private void JustDoIt()
    {
        Foo a = new Foo();

        //a.Bar();

        logger.info("Foo Bar " + a.Bar());
    }
}
