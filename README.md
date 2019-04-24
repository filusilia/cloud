# spring cloud演示项目

> 尝试学习cloud

## 系统
1. 使用spring cloud Greenwich
2. springboot 2.1.4

## 说明
- 

## 非常重要

* idea非单例启动: edit configuration-> allow parallel run 可以启动多个实例
* idea控制台乱码解决方案：
    1. idea->help->edit custom vm option ,添加`-Dfile.encoding=UTF-8`
    2. tomcat->vm option ,添加`-Dfile.encoding=UTF-8`
* thymeleafsecurity5为了安全需要给密码添加加密方式,否则会报
  `java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"`
* 在poi4.0.0中`org.apache.poi.POIXMLDocument;`修改位置到`org.apache.poi.ooxml.POIXMLDocument; `导致docx转换工作无法使用，目前只能使用3.17版本
* jpa相关：
    1. jpa需要添加
        `database-platform: org.hibernate.dialect.MySQL5InnoDBDialect`来创建默认引擎为InnoDB的数据库表，否则默认为MyISAM
    2. 表名@Table(javax.persistence)  
    3. 索引@Table(***,indexes = {@Index(name = "索引名", columnList = "字段")})
    4. hibernate大数据字段：@Lob
    5. @Column(name = "列名", length = 250(length只对String字段类型有效),columnDefinition="数据库自定义DDL")
    6. @Data(lombok.Data) 自动构建getter,setter，toString等
    7. @Entity标识实体类
    8. @org.hibernate.annotations.Table(appliesTo = "指定表", comment = "表注释")
* Interceptor(拦截器):
    1. MybatisCustomInterceptor mybatis拦截器,用于对insert,update方法进行拦截,自动添加新增时间/更新时间
        原理通过拦截sql类型进行判断是否是insert/update,再通过查询字段dateCreate进行反射赋值.
        
## 使用

## 发布历史

### ver.1.0.0.BETA
    
    初版
