package com;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Add2Num {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyBigNumber.class.getName());
        String a = "01234", b = "897"; 
        logger.log(Level.INFO, "resrult {0} + {1} = {2}", new Object[]{a, b, MyBigNumber.sum(a, b)});
    }
}