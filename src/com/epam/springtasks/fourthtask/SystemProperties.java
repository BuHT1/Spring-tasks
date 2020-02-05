package com.epam.springtasks.fourthtask;

public class SystemProperties{
    private Integer id;

    private String serverName;

    private Boolean serverEnabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Boolean getServerEnabled() {
        return serverEnabled;
    }

    public void setServerEnabled(Boolean serverEnabled) {
        this.serverEnabled = serverEnabled;
    }

    @Override
    public String toString() {
        return "SystemProperties{" + "id=" + id +
                ", serverName='" + serverName + '\'' +
                ", serverEnabled=" + serverEnabled +
                '}';
    }
}
