package snc.sncmodels.services.betting.rs;

import java.time.Instant;

public class BetRs {
    private String userId;
    private String winAmount;
    private Instant transactionTime;
    private String resultingBalance;

    public String getUserId() {
        return userId;
    }

    public BetRs setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getWinAmount() {
        return winAmount;
    }

    public BetRs setWinAmount(String winAmount) {
        this.winAmount = winAmount;
        return this;
    }

    public Instant getTransactionTime() {
        return transactionTime;
    }

    public BetRs setTransactionTime(Instant transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    public String getResultingBalance() {
        return resultingBalance;
    }

    public BetRs setResultingBalance(String resultingBalance) {
        this.resultingBalance = resultingBalance;
        return this;
    }
}
