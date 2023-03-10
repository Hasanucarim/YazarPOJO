package com.qatester.ex03.controllers;

import com.qatester.ex03.beans.Kitap;
import com.qatester.ex03.beans.Yazar;
import com.qatester.ex03.repository.YazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;


    @RestController
    @RequestMapping("/api2")
    public class YazarController {

        @Autowired
        YazarRepository yazarRepository;

        @GetMapping
        public List<Yazar> getAllYazar() {
            return yazarRepository.findAll();

        }

        @PutMapping(value ="/{id}", consumes = "application/json")
        public List<Yazar> replaceYazar(@PathVariable Long id, @RequestBody Yazar yazar) {

            yazarRepository.deleteById(id);
            yazarRepository.save(yazar);
            return yazarRepository.findAll();

        }

        @PatchMapping(value = "/{id}", consumes = "application/json")
        public List<Yazar> updateYazar(@PathVariable Long id, @RequestBody Yazar yeniYazar) {
            Yazar aktifYazar = yazarRepository.findById(id).get();

            aktifYazar.setYazarAdi(yeniYazar.getYazarAdi());
            aktifYazar.setYazarAdi(yeniYazar.getYazarAdi());

            yazarRepository.save(aktifYazar);
            return yazarRepository.findAll();
        }

        @DeleteMapping()
        public List<Yazar> deleteALlYazars() {

            yazarRepository.deleteAll();
            return yazarRepository.findAll();
        }
    }