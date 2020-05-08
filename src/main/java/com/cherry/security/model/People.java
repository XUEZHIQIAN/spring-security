package com.cherry.security.model;

import lombok.Data;

/**
 * People
 *
 * @author Hang W
 */
@Data
public class People {

    public People() {
    }

    public People(int sex, String name, String drlType) {
        this.sex = sex;
        this.name = name;
        this.drlType = drlType;
    }

    private String name;

    private int sex;

    private String drlType;

}
