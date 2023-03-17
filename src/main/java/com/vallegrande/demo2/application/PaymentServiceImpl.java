package com.vallegrande.demo2.application;

import com.vallegrande.demo2.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> listados() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment crear(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        Optional<Payment> optionalPayment = paymentRepository.findById(payment.getId());
        if (!optionalPayment.isPresent())throw new RuntimeException("No se encontro el pago indicado!");
        return paymentRepository.save(payment);

    }

    @Override
    public void delete(Integer id) {
        Optional<Payment> optionalPayment = paymentRepository.findById(id);
        if (!optionalPayment.isPresent()) throw new RuntimeException("No se encontro el pago que busca eliminar");
        paymentRepository.deleteById(id);
    }
}
