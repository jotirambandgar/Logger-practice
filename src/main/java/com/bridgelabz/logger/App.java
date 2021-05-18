package com.bridgelabz.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
    	Layout layout = new PatternLayout("%d   %p    %m     %C      %M     %n");
        Appender appender = new FileAppender(layout, "Applog.log");
//    	Appender appender = new ConsoleAppender(layout);
        logger.addAppender(appender);
        logger.debug("debug priority");
        logger.info("info priority");
        logger.warn("warn priority");
        logger.error("error priority");
        logger.fatal("fatal priority");
    }
}
