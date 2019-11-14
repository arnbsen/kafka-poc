package com.arnbsen.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class DemoModel {

    @Getter @Setter private Integer id;
    @Getter @Setter private String topic;
    @Getter @Setter private String description;

    @Override
    public String toString() {
        return "DemoModel [description=" + description + ", id=" + id + ", topic=" + topic + "]";
    }

}