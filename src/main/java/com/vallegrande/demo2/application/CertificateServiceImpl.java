package com.vallegrande.demo2.application;

import com.vallegrande.demo2.domain.Certificate;
import com.vallegrande.demo2.domain.CertificateRepository;
import com.vallegrande.demo2.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceImpl implements CertificateService {


    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public List<Certificate> listados() {
        return certificateRepository.findAll();
    }

    @Override
    public Certificate crear(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate update(Certificate certificate) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(certificate.getId());
         if (!optionalCertificate.isPresent())throw new RuntimeException("No se encontro el certificado indicado!");
         return certificateRepository.save(certificate);

    }

    @Override
    public void delete(Integer id) {
        Optional<Certificate> optionalCertificate = certificateRepository.findById(id);
        if (!optionalCertificate.isPresent()) throw new RuntimeException("No se encontro el Certificado que busca eliminar");
        certificateRepository.deleteById(id);

    }
}
