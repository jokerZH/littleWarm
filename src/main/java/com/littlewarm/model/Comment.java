package com.littlewarm.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Comment {
    public String userId;
    public String topicId;
    public String extra;

    public Comment() {}
    public Comment(String userId, String topicId, String extra) {
        this.userId = userId;
        this.topicId = topicId;
        this.extra = extra;
    }

    public void setUserId(String userId) { this.userId = userId; }
    public String getUserId() { return this.userId; }
    public void setTopicId(String topicId) { this.topicId = topicId; }
    public String getTopicId() { return this.topicId; }

    @Override
    public String toString() {
        return toJsonElement().toString();
    }

    public JsonElement toJsonElement() {
        JsonObject object = new JsonObject();
        object.addProperty("user_id", userId);
        object.addProperty("topic_id", topicId);
        object.addProperty("extra", extra);
        return object;
    }
}
