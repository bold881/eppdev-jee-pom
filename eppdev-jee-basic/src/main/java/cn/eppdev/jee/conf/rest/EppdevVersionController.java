/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Apache License 2.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fan.hao
 */
@RestController
@RequestMapping(EppdevVersionController.URL)
public class EppdevVersionController extends BasicController<EppdevVersion, EppdevVersionParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevVersionController.class);

    public static final String URL= "/_eppdev_version";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}
