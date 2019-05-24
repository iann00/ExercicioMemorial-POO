package com.company.models;

public class Visita {
    public int id;
    public String userId;
    public long timestamp;
    public boolean publica;

    public Visita() { }

    public Visita(int id, String userId,
                  long timestamp,
                  boolean publica) {
        this.id        = id;
        this.userId    = userId;
        this.timestamp = timestamp;
        this.publica   = publica;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    public boolean isPublica() {
        return publica;
    }
}
