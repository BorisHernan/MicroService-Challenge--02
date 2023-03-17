package com.vallegrande.demo2.rest;

import com.vallegrande.demo2.domain.Certificate;
import com.vallegrande.demo2.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challeger/v1/certificates")
public class CentificateController {

    @Autowired
    public CertificateService certificateService;

    @GetMapping
    public List<Certificate> listar() {
        return certificateService.listados();
    }

    @PostMapping
    public Certificate create(@RequestBody Certificate certificate) {
        return certificateService.crear(certificate);
    }

    @PutMapping
    public Certificate update(@RequestBody Certificate certificate) {
        return certificateService.update(certificate);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        certificateService.delete(id);
    }

}
