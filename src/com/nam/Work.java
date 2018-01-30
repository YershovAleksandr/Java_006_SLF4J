package com.nam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        A a = new A();

        B b = new B();

        logger.info("a.get42 " + a.get42());

        logger.info("b.get42 " + b.get42());

        logger.info("b.get4242 " + b.get4242());
    }
}






class A
{
    int i;

    int get42()
    {
        return 42;
    }
}

class B extends A
{
    int get4242()
    {
        return 4200 + get42();
    }
}

