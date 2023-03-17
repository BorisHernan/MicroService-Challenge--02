package com.vallegrande.demo2.domain;


import java.util.List;

public interface CertificateService {

    List<Certificate> listados();
    Certificate crear(Certificate certificate);

    Certificate update(Certificate certificate);

    void delete (Integer id);
}
