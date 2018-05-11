
package lv.va.sludinajumuportals.dao;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import lv.va.sludinajumuportals.domain.User;

    @Repository
public interface UserRepository
        extends CrudRepository<User, Long> {

    public List<Advertisement> findByName(String name);


    
}
