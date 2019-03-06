/* FileName: DaoTemplateTest.java
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
public class DaoTemplateTest {
    static Logger logger = LoggerFactory.getLogger(DaoTemplateTest.class);

    @Test
    public void testBasicDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/basic_dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        System.out.println(result);
    }

    @Test
    public void testUpperDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/upper_dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        System.out.println(result);
    }

    @Test
    public void testDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        System.out.println(result);
    }
}
