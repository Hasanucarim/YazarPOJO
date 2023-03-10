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
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kitapID;
    @NonNull
    private String kitapAdi;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate basimTarihi;
    private String tur;

}
