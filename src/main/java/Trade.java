import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.transform.Source;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Wallet wallet;
    private LocalDateTime exchangeDate;
    private String sourceType;
    private String target;
    private double exchangeRate;
    private double sourceAmount;

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public LocalDateTime getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(LocalDateTime exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return Double.compare(trade.exchangeRate, exchangeRate) == 0 && Double.compare(trade.sourceAmount, sourceAmount) == 0 && Objects.equals(id, trade.id) && Objects.equals(wallet, trade.wallet) && Objects.equals(exchangeDate, trade.exchangeDate) && Objects.equals(sourceType, trade.sourceType) && Objects.equals(target, trade.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wallet, exchangeDate, sourceType, target, exchangeRate, sourceAmount);
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", wallet=" + wallet +
                ", exchangeDate=" + exchangeDate +
                ", sourceType='" + sourceType + '\'' +
                ", target='" + target + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", sourceAmount=" + sourceAmount +
                '}';
    }
}
