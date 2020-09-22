package com.thoughtworks.basic;

public class FlagSchema {
    private String flag;
    ValueType valueType;

    public FlagSchema(String flag, ValueType valueType) {
        this.flag = flag;
        this.valueType = valueType;
    }

    public Object getDefaultValue(){
        return valueType.getDefaultValue();
    }

    public String getFlag() {
        return flag;
    }

    public ValueType getValueType() {
        return valueType;
    }
}
