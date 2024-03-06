package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserSetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.stereotype.Service;

import application.model.User;
import application.repository.UserRepository;
import application.repository.Userrepository;

@Service 
public class AppUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws User;
}