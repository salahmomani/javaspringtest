package com.salah.springRest.repo;

import com.salah.springRest.model.VendorCloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//salah almoamni
@Repository
public interface VendorRepo extends JpaRepository<VendorCloud,String> {
}
