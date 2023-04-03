package snc.sncmodels.services.betting.rs;

import java.time.Instant;

public class TopUpRs {
    private String userId;
    private Instant transactionTime;
    private String resultingBalance;

    public String getUserId() {
        return userId;
    }

    public TopUpRs setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Instant getTransactionTime() {
        return transactionTime;
    }

    public TopUpRs setTransactionTime(Instant transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    public String getResultingBalance() {
        return resultingBalance;
    }

    public TopUpRs setResultingBalance(String resultingBalance) {
        this.resultingBalance = resultingBalance;
        return this;
    }
}
