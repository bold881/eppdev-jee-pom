#########################################
# DataBase Configurations
#########################################
spring.datasource.url=jdbc:mysql://localhost:3306/eppdev_jee?useUnicode=true&amp;characterEncoding=UTF-8
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.type = com.alibaba.druid.pool.DruidDataSource
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.continue-on-error=true
spring.datasource.filters = stat
spring.datasource.maxActive = 50
spring.datasource.initialSize = 3
spring.datasource.maxWait = 60000
spring.datasource.minIdle = 1
spring.datasource.timeBetweenEvictionRunsMillis = 60000
spring.datasource.minEvictableIdleTimeMillis = 300000
spring.datasource.validationQuery = select 'x'
spring.datasource.testWhileIdle = true
spring.datasource.testOnBorrow = false
spring.datasource.testOnReturn = false
spring.datasource.poolPreparedStatements = true
spring.datasource.maxOpenPreparedStatements = 20
spring.datasource.initialization-mode=always



#########################################
# PageHelper Configurations
#########################################
pagehelper.autoDialect=true
pagehelper.closeConn=true
pagehelper.offset-as-page-num=false
pagehelper.supportMethodsArguments=true
pagehelper.params=pageSize=_pageSize;pageNum=_pageNum;


#########################################
# Log Configurations
#########################################
logging.level.root=INFO
logging.level.${BASIC_PACKAGE_NAME}=DEBUG