package pl.codecity;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Insurance {

    private Long id;
    private String email;
    private Double amount;

    public Insurance(Long id, String email, Double amount) {
        this.id = id;
        this.email = email;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
