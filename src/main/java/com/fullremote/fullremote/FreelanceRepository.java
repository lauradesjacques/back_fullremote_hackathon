package com.fullremote.fullremote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelanceRepository extends JpaRepository <Freelancer,Long>{

}
