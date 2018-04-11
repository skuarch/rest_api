package rest_api.rest_api.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private DataSource dataSource;
    
    private static final String SQL_LOGIN = "select users_email as username, users_password as password, users_is_active as enabled from users where users_email = ?;";
    private static final String SQL_AUTHORIZATION = "select u.users_email as usermame, r.roles_name as authority from users u, users_roles ur, roles r where (u.users_id = ur.users_id) and (u.users_email = ?);";
    
    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder amb) throws Exception {
        amb
                .jdbcAuthentication()
                .usersByUsernameQuery(SQL_LOGIN)
                .authoritiesByUsernameQuery(SQL_AUTHORIZATION)
                .dataSource(dataSource);
                
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()          
                .antMatchers(HttpMethod.POST, "/users")
                .authenticated()
                .and()
                .csrf()
                .disable()
                .httpBasic();
        
    }
    
    
    
}
