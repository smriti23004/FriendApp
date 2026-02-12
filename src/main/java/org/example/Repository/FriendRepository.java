package org.example.Repository;
import org.example.Model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

/*This interface acts as the bridge between our Java code and the H2 Database.
By extending JpaRepository, Spring automatically gives us a full suite of
 CRUD operations (Create, Read, Update, Delete) without us writing a single SQL query.*/
public interface FriendRepository extends JpaRepository<Friend,Long> {

    //all the standard methods like
    // .save(), .findAll(), .findById(), and .delete() are inherited.


}
