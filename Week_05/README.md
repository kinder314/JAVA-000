wk05作业

周四

2.（必做）写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 Github。

    通过三种方式装配bean
    1. XML -> houseBeanForXml -> 通过spring-beans.xml定义
    2. 注解自动扫描 -> houseBeanForAnnotation -> 通过配置@Component @Resource装配
    3. Spring Configuration -> houseBeanForConfiguration -> 通过@Configuration @Bean方法 装配

周六

4.（必做）给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。

    自动配置入口类：com.homework.wk05.starters.AutoConfiguration
    starter依赖
            <groupId>com.homework.wk05</groupId>
            <artifactId>hw01-starter</artifactId>
            <version>0.0.1-SNAPSHOT</version>

6.（必做）研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法：
1）使用 JDBC 原生接口，实现数据库的增删改查操作。
2）使用事务，PrepareStatement 方式，批处理方式，改进上述操作。
3）配置 Hikari 连接池，改进上述操作。提交代码到 Github。

    实现类 JdbcDemo
    