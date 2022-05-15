package tn.esprit.TRAVELGO.service;

import tn.esprit.TRAVELGO.entities.User;
import tn.esprit.TRAVELGO.entities.email;

public interface IEmail {
    email saveEmail(email e);
    email saveE(email e, User user);
}
