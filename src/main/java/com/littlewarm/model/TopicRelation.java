package com.littlewarm.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class TopicRelation {
    public String srcId;
    public String desId;
    public String extra;

    public TopicRelation() {}
    public TopicRelation(String srcId, String desId, String extra) {
        this.srcId = srcId;
        this.desId= desId;
        this.extra = extra;
    }

    public void setSrcId(String srcId) { this.srcId = srcId; }
    public String getSrcId() { return this.srcId; }
    public void setDesId(String desId) { this.desId = desId; }
    public String getDesId() { return this.desId; }
    public void setExtra(String extra) { this.extra = extra; }
    public String getExtra() { return this.extra; }

    @Override
    public String toString() {
        return toJsonElement().toString();
    }

    public JsonElement toJsonElement() {
        JsonObject object = new JsonObject();
        object.addProperty("src_id", srcId);
        object.addProperty("des_id", desId);
        object.addProperty("extra", extra);
        return object;
    }
}
