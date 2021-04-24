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

    public String getDOLAR() {
        return DOLAR;
    }

    public String getGOLD() {
        return GOLD;
    }

    public String getSILVER() {
        return SILVER;
    }

    public String getBTC() {
        return BTC;
    }

    public String getETH() {
        return ETH;
    }
}