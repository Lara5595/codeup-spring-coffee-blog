package com.codeup.weywotspringblog.repositories;


import com.codeup.weywotspringblog.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    Coffee findById(long id);
}
