package com.example.demo.Test7.websocket2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigerAdapter extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().
                //不拦截 路径 / /login
                antMatchers("/","/login")
                .permitAll()
                .anyRequest().authenticated().and().formLogin()
                //设置登陆页面访问路径
                .loginPage("/login")
                //登陆成功后的跳转路径
                .defaultSuccessUrl("/chat")
                .permitAll().and().logout().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("evan").password("evan").roles("USER")
                .and().withUser("yang").password("yang").roles("USER");
    }

    /**
     * 不拦截静态资源
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/static/**");
    }
}
