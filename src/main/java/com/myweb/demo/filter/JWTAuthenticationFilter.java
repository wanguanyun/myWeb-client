package com.myweb.demo.filter;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {
	 public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
	        super(authenticationManager);
	    }

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
	        String header = request.getHeader("Authorization");
	        if (header == null || !header.startsWith("Bearer ")) {
	            chain.doFilter(request, response);
	            return;
	        }
	        UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        chain.doFilter(request, response);
	    }

	    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
	        String token = request.getHeader("Authorization");
	        if (token != null) {
	            // parse the token.
	            String user = Jwts.parser()
	                    .setSigningKey("spring-security-@Jwt!&Secret^#")
	                    .parseClaimsJws(token.replace("Bearer ", ""))
	                    .getBody()
	                    .getSubject();
	            if (user != null) {
	                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
	            }
	            return null;
	        }
	        return null;
	    }
}
