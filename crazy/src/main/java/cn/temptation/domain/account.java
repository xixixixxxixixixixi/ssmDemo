package cn.temptation.domain;

public class account {
    private Integer id;

    private Integer passworld;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassworld() {
        return passworld;
    }

    public void setPassworld(Integer passworld) {
        this.passworld = passworld;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}