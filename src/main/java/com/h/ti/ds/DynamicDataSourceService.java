//package com.h.ti.ds;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.h.ti.dao.DataSourceModelDao;
//import com.h.ti.pojo.DataSourceModel;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//import org.springframework.util.CollectionUtils;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.List;
//
//@Service
//public class DynamicDataSourceService {
//
//  private Logger logger = LoggerFactory.getLogger(DynamicDataSourceService.class);
//
////  @Autowired
////  @Qualifier(value = "dynamicDataSource")
//  @Resource
//  private DataSource dynamicDataSource;
//
////  @Autowired
//@Resource
//  private DataSourceModelDao dataSourceModelDao;
//
//
//  public  void addDataSourceToResolvedCache(DataSourceModel model){
//
//    DruidDataSource dataSource = new DruidDataSource();
//
//    dataSource.setDriverClassName(model.getDriverClassName());
//    dataSource.setUrl(model.getUrl());
//    dataSource.setUsername(model.getUsername());
//    dataSource.setPassword(model.getPassword());
//
//    try {
//      dataSource.init();
//    } catch (SQLException e) {
//      logger.error(e.toString());
//      e.printStackTrace();
//      throw new RuntimeException("数据源初始化失败！");
//    }
//
//    DynamicDataSource dds = (DynamicDataSource) dynamicDataSource;
//    dds.addResolvedDataSource(model.getDsName(),dataSource);
//
//  }
//
//
//@PostConstruct
//  private  void initTargetDataSource(){
//    logger.info("===============PostConstruct===================");
//
//    DynamicDataSourceContextHolder.setDataSource("");
//
//    List<DataSourceModel> dataSourceModels = dataSourceModelDao.queryAllDataSourceModels();
//
//    logger.info("================================================");
//    logger.info("init list =" +dataSourceModels.size());
//    logger.info("================================================");
//
//    if(!CollectionUtils.isEmpty(dataSourceModels)){
//      dataSourceModels.stream().forEach(e -> addDataSourceToResolvedCache(e));
//    }
//
//  }
//
//
//
//
//
//
//
//
//
//}
