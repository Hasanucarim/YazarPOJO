package com.qatester.ex03.repository;

import com.qatester.ex03.beans.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository<Kitap, Long> {

}
