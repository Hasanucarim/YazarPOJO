package com.qatester.ex03.repository;

import com.qatester.ex03.beans.Kitap;
import com.qatester.ex03.beans.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YazarRepository extends JpaRepository<Yazar, Long> {

}
