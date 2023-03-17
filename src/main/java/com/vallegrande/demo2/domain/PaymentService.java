package com.vallegrande.demo2.domain;

import java.util.List;

public interface PaymentService {

    List<Payment> listados();
    Payment crear(Payment payment);

    Payment update(Payment payment);

    void delete (Integer id);
}
