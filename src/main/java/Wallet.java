import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Wallets")
public class Wallet implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "euro")
    private double euro;

    @Column(name = "dolar")
    private double dolar;

    @Column(name = "gold")
    private double gold;

    @Column(name = "silver")
    private double silver;

    @Column(name = "bitcoin")
    private double bitcoin;

    @Column(name = "etherium")
    private double etherium;

    @OneToOne
    private Users owner;

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public double getSilver() {
        return silver;
    }

    public void setSilver(double silver) {
        this.silver = silver;
    }

    public double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public double getEtherium() {
        return etherium;
    }

    public void setEtherium(double etherium) {
        this.etherium = etherium;
    }
}
