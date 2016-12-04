package com.littlewarm.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Topic {
    public String id;
    public String desc;
    public String extra;

    public Topic() {}
    public Topic(String id, String desc, String extra) {
        this.id = id;
        this.desc = desc;
        this.extra = extra;
    }

    public void setId(String id) { this.id = id; }
    public String getId() { return this.id; }
    public void setDesc(String desc) { this.desc = desc; }
    public String getDesc() { return this.desc; }
    public void setExtra(String extra) { this.extra = extra; }
    public String getExtra() { return this.extra; }

    @Override
    public String toString() {
        return toJsonElement().toString();
    }

    public JsonElement toJsonElement() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", id);
        jsonObject.addProperty("desc", desc);
        jsonObject.addProperty("extra", extra);
        return jsonObject;
    }
}
