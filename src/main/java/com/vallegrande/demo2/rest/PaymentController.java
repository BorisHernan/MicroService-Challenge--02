package com.vallegrande.demo2.rest;

import com.vallegrande.demo2.domain.Certificate;
import com.vallegrande.demo2.domain.CertificateService;
import com.vallegrande.demo2.domain.Payment;
import com.vallegrande.demo2.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challeger/v1/payment")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;

    @GetMapping
    public List<Payment> listar() {
        return paymentService.listados();
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentService.crear(payment);
    }

    @PutMapping
    public Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        paymentService.delete(id);
    }
}
