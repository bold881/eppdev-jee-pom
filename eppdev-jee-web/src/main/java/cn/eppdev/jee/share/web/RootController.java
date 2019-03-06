/* FileName: RootController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.jee.share.web;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fan.hao
 */
@Controller("webRootController")
public class RootController {
    static Logger logger = LoggerFactory.getLogger(RootController.class);

    @RequestMapping("/")
    public String index(){
        return "redirect:/web/conf/version/view/" + EppdevVersion.MASTER_VERSION_ID;
    }
}
