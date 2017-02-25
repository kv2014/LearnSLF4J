package Learndemo;
public   class  Wombat  extends BaseClass{
    Integer t;
    Integer oldT;
     public   void  setTemperature(Integer temperature)  {
        oldT  =  t;
        t  =  temperature;
        logger.error( " Temperature set to {}. Old temperature was {}. " , t, oldT);
         if  (temperature.intValue()  >   50 )  {
            logger.debug( " Temperature has risen above 50 degrees. {}",1 );
        } 
         test();
     } 
     
     
     public   static   void  main(String[] args)  {
        Wombat wombat  =   new  Wombat();
        wombat.setTemperature( 1 );
        wombat.setTemperature( 55 );
        new class2().test();
        new BaseClass().test();
    } 
}