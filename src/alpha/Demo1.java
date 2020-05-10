package alpha;
import org.apache.logging.log4j.*;

public class Demo1 {

	//LogManager is an api, getLogger is method of it.
	private static Logger log = LogManager.getLogger(Demo1.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("this is a debug message");
		log.info("this  is a info  message");
		log.warn("this  is a warn  message");
		log.error("this is a error message");
		log.fatal("this is a fatal message");
	}
}