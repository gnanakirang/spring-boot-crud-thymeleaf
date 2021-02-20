package com.baeldung.crud.repositories;

import com.baeldung.crud.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
	Account findOneByEmail(String email);
}