package kr.or.boostcourse.booking.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class DBConfig implements TransactionManagementConfigurer {
		
			private String dirverClassName = "com.mysql.cj.jdbc.Driver";
			private String url =  "jdbc:mysql://localhost:3306/booking?useUnicode=true&characterEncoding=utf8&verifyServerCertificate=false&useSSL=true&serverTimezone=UTC";
			private String username = "booking";
			private String password = "booking123!@#";
			
			@Bean
			public DataSource dataSource() {
					BasicDataSource dataSource = new BasicDataSource();
					dataSource.setDriverClassName(dirverClassName);
					dataSource.setUrl(url);
					dataSource.setUsername(username);
					dataSource.setPassword(password);
					return dataSource;
			}
			
			@Override
			public PlatformTransactionManager annotationDrivenTransactionManager() {
				return transactionManger();
			}

			@Bean
			public PlatformTransactionManager transactionManger() {
				return new DataSourceTransactionManager(dataSource());
			}
}