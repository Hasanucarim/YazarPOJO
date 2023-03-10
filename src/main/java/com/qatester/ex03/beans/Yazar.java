package com.qatester.ex03.beans;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@RequiredArgsConstructor
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Yazar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int yazarID;
    @NonNull
    private String yazarAdi;
    private String yazarSoyadi;
    private String yazarinEseri;

}
