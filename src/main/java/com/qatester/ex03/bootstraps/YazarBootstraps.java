package com.qatester.ex03.bootstraps;

import com.qatester.ex03.beans.Kitap;
import com.qatester.ex03.beans.Yazar;
import com.qatester.ex03.repository.KitapRepository;
import com.qatester.ex03.repository.YazarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class YazarBootstraps implements CommandLineRunner {

    @Autowired
    YazarRepository yazarRepository;

    @Override
    public void run(String... args) throws Exception {
        Yazar yazar = new Yazar();
        yazar.setYazarID(123);
        yazar.setYazarAdi("Omer");
        yazar.setYazarSoyadi("Seyfettin");
        yazar.setYazarinEseri("Yalniz Efe");

        yazarRepository.save(yazar);

        yazarRepository.save(Yazar.builder().yazarID(124).yazarAdi("Sabahattin").yazarSoyadi("Ali").yazarinEseri("Kurk Mantolu Madonna").build());
        yazarRepository.save(Yazar.builder().yazarID(125).yazarAdi("Orhan").yazarSoyadi("Kemal").yazarinEseri("Ekmek Kavgası").build());
        yazarRepository.save(Yazar.builder().yazarID(126).yazarAdi("Peyami").yazarSoyadi("Safa").yazarinEseri("Fatih Harbiye").build());

    }
}
