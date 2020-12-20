package com.informatorio.repositories;
import com.informatorio.models.UserModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    
}
