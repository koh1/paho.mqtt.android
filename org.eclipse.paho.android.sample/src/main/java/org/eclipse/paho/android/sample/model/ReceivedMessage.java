package org.eclipse.paho.android.sample.model;

import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Date;
//import java.util.Calendar;
//import java.util.TimeZone;


public class ReceivedMessage {
    public ReceivedMessage(String topic, MqttMessage message) {
        this.topic = topic;
        this.message = message;
        this.timestamp = new Date();
        //this.tscal = Calendar.getInstance(TimeZone.getDefault()).setTime(this.timestamp);

    }

    private final String topic;
    private final MqttMessage message;
    private final Date timestamp;

    public String getTopic() {
        return topic;
    }

    public MqttMessage getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "ReceivedMessage{" +
                "topic='" + topic + '\'' +
                ", message=" + message +
                ", timestamp=" + timestamp +
                '}';
    }
}
