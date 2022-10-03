package com.lear.springsecuritytest.controller;

import com.lear.springsecuritytest.jwthelper.JwtUtilHelper;
import com.lear.springsecuritytest.models.JwtRequest;
import com.lear.springsecuritytest.services.CustomeUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

//    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private CustomeUserDetailsService customeUserDetailsService;
    @Autowired
    private JwtUtilHelper jwtUtilHelper;

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        System.out.println("My Request ========= " + jwtRequest);
   try {
       this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(),jwtRequest.getPassword()));

   }catch (UsernameNotFoundException e){
       e.printStackTrace();
       throw  new Exception("Bad Credentials");
   }
return  null;
    }

}
