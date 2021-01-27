package com.example.demo.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

/**
 * The class which contains spring security user details fields.
 * 
 * @author 126518307
 *
 */
@SuppressWarnings("serial")
public class JwtUserDetails implements org.springframework.security.core.userdetails.UserDetails {

	private String username;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}