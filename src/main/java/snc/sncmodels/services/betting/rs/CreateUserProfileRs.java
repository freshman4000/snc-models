package snc.sncmodels.services.betting.rs;

public class CreateUserProfileRs {
    private String userId;
    private String nickName;
    private String balance;

    public String getUserId() {
        return userId;
    }

    public CreateUserProfileRs setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getBalance() {
        return balance;
    }

    public CreateUserProfileRs setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public CreateUserProfileRs setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
}
