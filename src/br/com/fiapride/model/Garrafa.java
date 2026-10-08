package br.com.fiapride.model;

public class Garrafa {
    private String cor;
    private String material;
    private int capacidadeEmMl;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidadeEmMl() {
        return capacidadeEmMl;
    }

    public void setCapacidadeEmMl(int capacidadeEmMl) {
        if (capacidadeEmMl >= 0 && capacidadeEmMl <= 1000) {
            this.capacidadeEmMl = capacidadeEmMl;
        } else {
            System.out.println("Erro: a capacidade deve estar entre 0 e 1000 ml.");
        }
    }
}