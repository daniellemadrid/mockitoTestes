package model;

public interface PrePagoParquimetro {
    int getCreditoPrePago();
    int deposito(int valorDepositado);
    String emiteTicket();
}
