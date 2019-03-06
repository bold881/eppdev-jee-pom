/* FileName: UtilsTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By The MIT License (MIT)
 */

package cn.eppdev.jee.cg.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fan.hao
 */
public class UtilsTemplateTest {
    static Logger logger = LoggerFactory.getLogger(UtilsTemplateTest.class);

    @Test
    public void testJsonUtils(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/utils/json_utils.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        System.out.println(result);
    }
}
