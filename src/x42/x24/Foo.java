package x42.x24;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
    static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public String Bar() {
        Baz baz = new Baz();

        baz.callback(42);

        logger.info("Is Fuck = " + baz.isFuck());

        return new String("X42");
    }


    interface Callback {
        void callback(int param);
        //void cb2();

        default boolean isFuck()
        {
            return true;
        }
    }

    class Baz implements Callback {
        @Override
        public void callback(int param) {
            logger.info("Callback 42 = " + param);
        }

        /*@Override
        public boolean isFuck() {
            return false;
        }*/
    }

}