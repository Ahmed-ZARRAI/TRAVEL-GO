package tn.esprit.TRAVELGO.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tn.esprit.TRAVELGO.entities.News;
import tn.esprit.TRAVELGO.entities.Role;
import tn.esprit.TRAVELGO.entities.User;
import tn.esprit.TRAVELGO.entities.email;
import tn.esprit.TRAVELGO.service.Email;

import java.net.URI;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api")
public class emailC {
    @Autowired
    Email es;

    @PostMapping("/email/save")
    public ResponseEntity<email> SaveRole(@RequestBody email e){
        URI uri =URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/role/save").toUriString());
        return ResponseEntity.created(uri).body(es.saveEmail(e));

    }
    @PostMapping("/email/save/C")
    public ResponseEntity<email> SaveRole(@RequestBody email e, User user){
        URI uri =URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/role/save").toUriString());
        return ResponseEntity.created(uri).body(es.saveE(e,user));

    }
}
