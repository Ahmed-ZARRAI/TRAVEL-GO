package tn.esprit.TRAVELGO.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import tn.esprit.TRAVELGO.model.FileDB;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String username;
    private String password;
    private String companyName;
    private String email;
    private String localisationCompany;
    private String adressUser;
    private int phoneNumberUser;
    private boolean isEnable;
    private String fileName;
    Long idCompany;
    @Enumerated(EnumType.STRING)
    private SexeType sexeUser;
    @OneToOne
    private User user;
    @ManyToMany(  fetch = FetchType.EAGER, cascade = CascadeType.ALL  )
    private Collection<Role> roles = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private Set<ImageUser> ImageUser1;
    @ManyToOne
    private FileDB file;
    public String getFileName() {
        return fileName;
    }

}
