/* FileName: EppdevConfService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Apache License 2.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.service.auto._EppdevConfService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fan.hao
 */
@Service
public class EppdevConfService extends _EppdevConfService {

    static ConcurrentHashMap<String, String> CACHED_MAP = new ConcurrentHashMap<>();

    @Override
    public void customeInit(EppdevConf entity) {
    }

    public String getConf(String key) {
        return getAllConf().get(key);
    }


    public Map<String, String> getAllConf() {
        if (CACHED_MAP.keySet().size() == 0) {
            for (EppdevConf conf : listAll().getList()) {
                CACHED_MAP.put(conf.getConfName(), conf.getConfValue());
            }
        }
        return CACHED_MAP;
    }

    public String getDbType(){
        return getAllConf().get("DB_TYPE");
    }

    public String getProjectPath(){
        return getAllConf().get("PROJECT_PATH");
    }

    public String getBasicPackageName(){
        return getAllConf().get("BASIC_PACKAGE_NAME");
    }

    public String getGitPath(){
        return  getAllConf().get("GIT_PATH");
    }

    public String getGitAutoPush(){
        return getAllConf().get("GIT_AUTO_PUSH");
    }

    public String getGitUseNewBranch(){
        return getAllConf().get("GIT_USE_NEW_BRANCH");
    }

    public String getGitMainBranchName(){
        return getAllConf().get("GIT_MAIN_BRANCH_NAME");
    }

    /**
     * 重载基础方法，更新缓存对象
     * @param entity 要保存的数据对象
     * @return
     */
    @Override
    public int update(EppdevConf entity) {
        int cnt = super.update(entity);
        if (cnt > 0){
            CACHED_MAP.put(entity.getConfName(), entity.getConfValue());
        }
        return cnt;
    }
}
