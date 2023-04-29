package com.driver.model;

import javax.persistence.*;

@Table(name="payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private boolean paymentCompleted;

    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    Reservation reservation;

    public Payment(boolean paymentCompleted, PaymentMode paymentMode) {

        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
    }

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
