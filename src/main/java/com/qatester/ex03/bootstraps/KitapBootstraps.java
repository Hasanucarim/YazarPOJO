package com.qatester.ex03.bootstraps;

import com.qatester.ex03.beans.Kitap;
import com.qatester.ex03.repository.KitapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class KitapBootstraps implements CommandLineRunner {

    @Autowired
    KitapRepository kitapRepository;

    @Override
    public void run(String... args) throws Exception {
        Kitap kitap1 = new Kitap();
        kitap1.setKitapAdi("Merhaba Dünya");
        kitap1.setTur("Umut");
        kitap1.setBasimTarihi(LocalDate.parse("2020-01-02"));

        kitapRepository.save(kitap1);

        kitapRepository.save(Kitap.builder().kitapAdi("kitap2").tur("korku").basimTarihi(LocalDate.parse("2022-01-02")).build());
        kitapRepository.save(new Kitap(0L,"Kitap3",LocalDate.parse("2022-03-02"), "roman"));
        kitapRepository.save(new Kitap ("kitap4"));
         }
}
