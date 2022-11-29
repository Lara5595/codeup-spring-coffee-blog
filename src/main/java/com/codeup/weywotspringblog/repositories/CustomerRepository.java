package com.codeup.weywotspringblog.repositories;

import com.codeup.weywotspringblog.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findById(long id);

}
