/* FileName: MessageController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Apache License 2.0
 */

package cn.eppdev.jee.share.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fan.hao
 */
@Controller
public class MessageController {
    static Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping("/message")
    public String message(Model model){
        return "message";
    }
}
