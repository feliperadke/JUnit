public class Irpf {
    private String nome;
    private String cpf;
    private double totRendimentos;
    private double contrPrev;
    private int nroDep;
    private int idade;

    public Irpf(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getTotRendimentos() {
        return totRendimentos;
    }

    public void setTotRendimentos(double totRendimentos) {
        this.totRendimentos = totRendimentos;
    }

    public double getContrPrev() {
        return contrPrev;
    }

    public void setContrPrev(double contrPrev) {
        this.contrPrev = contrPrev;
    }

    public int getNroDep() {
        return nroDep;
    }

    public void setNroDep(int nroDep) {
        this.nroDep = nroDep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double impostoDevido() {
        double base;
        base = totRendimentos - contrPrev;
        int d = nroDep;
        double desconto;
        double newBase;
        if (idade < 65) {
            if (0 <= d && d <= 2) {
                desconto = base * 0.025;
            } else if (3 <= d && d <= 5) {
                desconto = base * 0.05;
            } else {
                desconto = base * 0.1;
            }
        } else {
            if (0 <= d && d <= 2) {
                desconto = base * 0.03;
            } else if (3 <= d && d <= 5) {
                desconto = base * 0.045;
            } else {
                desconto = base * 0.06;
            }
        }

        newBase = base - desconto;
        double impDevido;
        if (newBase < 10000) {
            impDevido = 0;
        } else if (newBase >= 10000 && newBase <= 20000) {
            impDevido = newBase * 0.15;
        } else {
            impDevido = newBase * 0.3;
        }
        return impDevido;
    }
}