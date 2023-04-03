package snc.sncmodels.services.betting.rq;

import java.math.BigDecimal;

public class TopUpRq {
    private String userId;
    private String topUpAmount;

    public String getUserId() {
        return userId;
    }

    public TopUpRq setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getTopUpAmount() {
        return topUpAmount;
    }

    public TopUpRq setTopUpAmount(String topUpAmount) {
        this.topUpAmount = topUpAmount;
        return this;
    }
}
