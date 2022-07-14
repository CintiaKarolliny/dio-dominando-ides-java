package br.com.dio.model;

import java.util.Objects;

public class Numero {
    private Double n1;
    private Double n2;

    public Numero() {
    }

    public Numero(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numero numero = (Numero) o;
        return Objects.equals(n1, numero.n1) && Objects.equals(n2, numero.n2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n1, n2);
    }

    @Override
    public String toString() {
        return "Numero{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}


