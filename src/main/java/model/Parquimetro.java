package model;

public interface Parquimetro {
    int inserirMoeda(int moeda);
    int getSaldo();
    int devolve();
    String emiteTicket();
}
