package com.lhl.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lunhengle on 2016/8/26.
 */
public class TestSlf4j {
    /**
     * 日志.
     */
    private static Logger logger = LoggerFactory.getLogger(TestSlf4j.class);
    /**
     * 循环的次数.
     */
    private final static long CONSTANTS = 10000L;

    @Test
    public void testSlf4j() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < CONSTANTS; i++) {
            logger.info("slf4j 测试！");
        }
        long endTime = System.currentTimeMillis();
        logger.info(String.valueOf(endTime - startTime));
    }
}
