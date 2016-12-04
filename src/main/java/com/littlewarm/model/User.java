package com.littlewarm.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class User {
    public String id;
    public String extra;

    public User() {}
    public User(String id, String extra) {
        this.id = id;
        this.extra = extra;
    }

    public void setId(String id) { this.id = id; }
    public String getId() { return this.id; }
    public void setExtra(String extra) { this.extra = extra; }
    public String getExtra() { return this.extra; }

    @Override
    public String toString() {
        return toJsonElement().toString();
    }

    public JsonElement toJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", id);
        jsonObject.addProperty("extra", extra);
        return jsonObject;
    }
}
