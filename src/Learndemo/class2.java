package Learndemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class class2 {
	
	
	final  Logger logger  =  LoggerFactory.getLogger(this.getClass());
	public void test(){
		
		logger.error( " Temperature set to {}. Old temperature was {}. " , 20, 30);
	}

}
