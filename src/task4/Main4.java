package task4;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Logger logger=Logger.getLogger(Main4.class.getName());
      //  MyCustomFileHandler myCustomFileHandler = new MyCustomFileHandler();
      //  myCustomFileHandler.setFormatter(new MyCustomFormatter());
      // logger.addHandler(myCustomFileHandler);
        FileHandler fileHandler = new FileHandler("Sinov.txt",true);
       fileHandler.setFormatter(new MyCustomFormatter());
        logger.addHandler(fileHandler);

        try {
        throw new RuntimeException();
      }catch (RuntimeException e){
          logger.log(Level.SEVERE,"xatolik->"+e);

      }

    }
}
