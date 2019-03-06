/* FileName: GitUtilsTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By The MIT License (MIT)
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author fan.hao
 */
public class GitUtilsTest {
    static Logger logger = LoggerFactory.getLogger(GitUtilsTest.class);

    String gitPath = "/Users/fan.hao/Projects/02-ciov/ciov-java-pom";

    //@Test
    public void testGitPull() throws IOException {
        GitUtils.gitPull(gitPath, "master");
    }

    //@Test
    public void testGitBranch() throws  IOException{
        GitUtils.gitNewBranch(gitPath, "dev/test");
    }

    //@Test
    public void testPush() throws IOException{
        GitUtils.gitPush(gitPath, "dev/test", "test");
    }

}
