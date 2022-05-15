package tn.esprit.TRAVELGO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.TRAVELGO.entities.SexeType;
import tn.esprit.TRAVELGO.entities.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
    List<User> findBySexeUser(SexeType sexeUser);
    List<User> findByAdressUser(String adressUser);
    User findByEmail(String email);
    void deleteById(Long id);





    @Query("SELECT COUNT(sexeUser) FROM User  WHERE sexeUser ='Women'")
    float getNumberWomen();
    @Query("SELECT COUNT(sexeUser) FROM User  WHERE sexeUser ='Men'")
    float getNumberMen();
    @Query("SELECT COUNT(id) FROM User ")
    float getNumberUser();


    @Query(value=" SELECT u from User  u where u.idCompany= :id ")
    List<User> findByUserCompany (@Param("id") Long id);



    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
