package br.com.mtisi.course.repository;


import br.com.mtisi.course.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
