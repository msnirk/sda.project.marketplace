import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wallets")
public class Wallet implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "euro")
    private String EURO;

    @Column(name = "dolar")
    private String DOLAR;

    @Column(name = "gold")
    private String GOLD;

    @Column(name = "silver")
    private String SILVER;

    @Column(name = "bitcoin")
    private String BTC;

    @Column(name = "eterium")
    private String ETH;

    public String getEURO() {
        return EURO;
    }

    public void setEURO(String EURO) {
        this.EURO = EURO;
    }

    public String getDOLAR() {
        return DOLAR;
    }

    public void setDOLAR(String DOLAR) {
        this.DOLAR = DOLAR;
    }

    public String getGOLD() {
        return GOLD;
    }

    public void setGOLD(String GOLD) {
        this.GOLD = GOLD;
    }

    public String getSILVER() {
        return SILVER;
    }

    public void setSILVER(String SILVER) {
        this.SILVER = SILVER;
    }

    public String getBTC() {
        return BTC;
    }

    public void setBTC(String BTC) {
        this.BTC = BTC;
    }

    public String getETH() {
        return ETH;
    }

    public void setETH(String ETH) {
        this.ETH = ETH;
    }
}