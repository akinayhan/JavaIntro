package aa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import aa.hrms.entities.concretes.User;

public interface UsersDao extends JpaRepository<User,Integer>{

}
