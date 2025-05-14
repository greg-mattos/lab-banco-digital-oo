
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Transacao {

    private Date date;
    private double amount;
    private String description;

    public Transacao(Date date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public void imprimeTransacao() {
        System.out.println("Date: " + date);
        System.out.println("Amount: $" + amount);
        System.out.println("Description: " + description);
        System.out.println();
    }
}