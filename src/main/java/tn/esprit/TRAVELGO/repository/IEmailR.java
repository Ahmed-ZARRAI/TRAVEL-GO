package tn.esprit.TRAVELGO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.TRAVELGO.entities.email;

@Repository
public interface IEmailR extends CrudRepository<email, Long> {
}
