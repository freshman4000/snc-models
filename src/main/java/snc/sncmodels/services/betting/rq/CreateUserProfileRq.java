package snc.sncmodels.services.betting.rq;

public class CreateUserProfileRq {
    private String userId;
    private String email;
    private String docId;
    private String nickName;
    private String login;
    private String passWord;

    public String getUserId() {
        return userId;
    }

    public CreateUserProfileRq setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateUserProfileRq setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDocId() {
        return docId;
    }

    public CreateUserProfileRq setDocId(String docId) {
        this.docId = docId;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public CreateUserProfileRq setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public CreateUserProfileRq setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassWord() {
        return passWord;
    }

    public CreateUserProfileRq setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }
}
