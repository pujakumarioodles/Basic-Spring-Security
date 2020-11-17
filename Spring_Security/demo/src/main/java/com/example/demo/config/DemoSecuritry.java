package com.example.demo.config;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class DemoSecuritry extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication().dataSource(dataSource);
		
    /*UserBuilder user=User.withDefaultPasswordEncoder();
    auth.inMemoryAuthentication().
    withUser(user.username("puja").password("puja123").roles("user","admin"))
    .withUser(user.username("anuska").password("puja123").roles("user","admin"))
    .withUser(user.username("sonu").password("puja123").roles("user" , "manager"))
    .withUser(user.username("jiya").password("puja123").roles("user"))
    ;*/
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/").hasRole("employee")
		.antMatchers("/leader/**").hasRole("manager")
		.antMatchers("/system/**").hasRole("admin")	
		//anyRequest().authenticated()
		.and().formLogin()
		.loginPage("/login").
		loginProcessingUrl("/authenticateTheUser").permitAll().and().logout().permitAll()
		.and().exceptionHandling().accessDeniedPage("/accessDenied")
		;
	/*antMatchers("/").hasRole("user")
		.antMatchers("/leader/**").hasRole("manager")
		.antMatchers("/system/**").hasRole("admin")*/	
	}
	

}
